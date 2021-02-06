package tim20.xml.sluzbenik.sluzbenikBek.core.error;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.core.exception.EmailTakenException;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

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

    @ExceptionHandler(JAXBException.class)
    protected ResponseEntity<Object> handleJAXB(JAXBException e) {
        ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
        return buildResponse(apiError);
    }

    @ExceptionHandler(XMLDBException.class)
    protected ResponseEntity<Object> handleXMLDB(XMLDBException e) {
        ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
        return buildResponse(apiError);
    }

    @ExceptionHandler(SAXException.class)
    protected ResponseEntity<Object> handleSAX(SAXException e) {
        ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
        return buildResponse(apiError);
    }

    @ExceptionHandler(TransformerException.class)
    protected ResponseEntity<Object> handleTransformer(TransformerException e) {
        ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
        return buildResponse(apiError);
    }

    @ExceptionHandler(IOException.class)
    protected ResponseEntity<Object> handleIO(IOException e) {
        ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
        return buildResponse(apiError);
    }

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<Object> handleException(Exception e) {
        e.printStackTrace();
        ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
        return buildResponse(apiError);
    }

    private ResponseEntity<Object> buildResponse(ApiError apiError) {
        return ResponseEntity.status(apiError.getStatus()).body(apiError);
    }
}
