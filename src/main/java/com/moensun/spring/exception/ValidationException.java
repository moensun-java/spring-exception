package com.moensun.spring.exception;

public class ValidationException extends MSException{
    public ValidationException(String code, Object... params) {
        super(code, params);
    }

    public ValidationException(Integer httpCode, String code, Object... params) {
        super(httpCode, code, params);
    }

    public ValidationException(Throwable cause, String code, Object... params) {
        super(cause, code, params);
    }

    public ValidationException(Integer httpCode, Throwable cause, String code, Object... params) {
        super(httpCode, cause, code, params);
    }
}
