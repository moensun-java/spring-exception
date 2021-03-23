package com.moensun.spring.exception;

public class MSPermissionDeniedException extends MSResourceException {
    public MSPermissionDeniedException() {
        super(null);
    }

    public MSPermissionDeniedException(String code, Object... params) {
        super(code, params);
    }

    public MSPermissionDeniedException(Integer httpCode, String code, Object... params) {
        super(httpCode, code, params);
    }

    public MSPermissionDeniedException(Throwable cause, String code, Object... params) {
        super(cause, code, params);
    }

    public MSPermissionDeniedException(Integer httpCode, Throwable cause, String code, Object... params) {
        super(httpCode, cause, code, params);
    }
}
