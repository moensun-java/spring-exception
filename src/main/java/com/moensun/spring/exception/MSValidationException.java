package com.moensun.spring.exception;

public class MSValidationException extends MSException {
    public MSValidationException(String code, Object... params) {
        super(code, params);
    }

    public MSValidationException(Integer httpCode, String code, Object... params) {
        super(httpCode, code, params);
    }

    public MSValidationException(Throwable cause, String code, Object... params) {
        super(cause, code, params);
    }

    public MSValidationException(Integer httpCode, Throwable cause, String code, Object... params) {
        super(httpCode, cause, code, params);
    }
}
