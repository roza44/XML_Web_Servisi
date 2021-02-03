package tim20.xml.poverenik.poverenikBek.core.error;

import javax.validation.ConstraintViolation;

public class ApiValidationError {
    private String object;
    private String field;
    private Object rejectedValue;
    private String message;

    public ApiValidationError(String object, String field, Object rejectedValue, String message) {
        this.object = object;
        this.field = field;
        this.rejectedValue = rejectedValue;
        this.message = message;
    }

    public ApiValidationError(String object, String message) {
        this.object = object;
        this.message = message;
    }

    public ApiValidationError(ConstraintViolation<?> constraintViolation) {
        object = constraintViolation.getRootBeanClass().getSimpleName();
        field = constraintViolation.getPropertyPath().toString();
        rejectedValue = constraintViolation.getInvalidValue();
        message = constraintViolation.getMessage();
    }

    public String getObject() {
        return object;
    }

    public String getField() {
        return field;
    }

    public Object getRejectedValue() {
        return rejectedValue;
    }

    public String getMessage() {
        return message;
    }
}
