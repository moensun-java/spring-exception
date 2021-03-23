package com.moensun.spring.exception;

public class MSBusinessException extends MSResourceException {

    public MSBusinessException(String code, Object... params) {
        super(code, params);
    }

    public MSBusinessException(Integer httpCode, String code, Object... params) {
        super(httpCode, code, params);
    }

    public MSBusinessException(Throwable cause, String code, Object... params) {
        super(cause, code, params);
    }

    public MSBusinessException(Integer httpCode, Throwable cause, String code, Object... params) {
        super(httpCode, cause, code, params);
    }
}
