package tim20.xml.poverenik.poverenikBek.core.error;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import tim20.xml.poverenik.poverenikBek.core.exception.EmailTakenException;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    protected ResponseEntity<Object> handleConstraintViolated(ConstraintViolationException ex) {
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, "Constraints violated", ex);

        for (ConstraintViolation<?> constraintViolation : ex.getConstraintViolations()) {
            apiError.addSubError(new ApiValidationError(constraintViolation));
        }

        return buildResponse(apiError);
    }

    @ExceptionHandler(EmailTakenException.class)
    protected ResponseEntity<Object> handleEmailTaken(EmailTakenException e) {
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, e.getMessage(), e);
        return buildResponse(apiError);
    }

    @ExceptionHandler(BadCredentialsException.class)
    protected ResponseEntity<Object> handleBadCredentialsException(
            BadCredentialsException ex
    ) {
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, "Invalid email/password" ,ex);
        return buildResponse(apiError);
    }

    @ExceptionHandler(AccessDeniedException.class)
    protected ResponseEntity<Object> handleAccessDenied(AccessDeniedException e) {
        ApiError apiError = new ApiError(HttpStatus.FORBIDDEN, e.getMessage(), e);
        return buildResponse(apiError);
    }

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<Object> handleException(Exception e) {
        ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
        return buildResponse(apiError);
    }

    private ResponseEntity<Object> buildResponse(ApiError apiError) {
        return ResponseEntity.status(apiError.getStatus()).body(apiError);
    }
}
