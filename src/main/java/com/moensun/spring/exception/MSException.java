package com.moensun.spring.exception;


/**
 * Created by Bane.Shi.
 * Copyright MoenSun
 * User: Bane.Shi
 * Date: 2016/11/25
 * Time: 22:00
 */
public class MSException extends RuntimeException {

    private String code;
    private String message;
    private Integer httpCode;

    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getHttpCode() {
        return httpCode;
    }

    public MSException(String message) {
        super(message);
        this.message = message;
    }

    public MSException(String message, Throwable cause) {
        super(message, cause);
        this.code = null;
        this.message = message;
        this.httpCode = null;
    }

    public MSException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
        this.httpCode = null;
    }

    public MSException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;
        this.httpCode = null;
    }

    public MSException(String code, String message, Integer httpCode) {
        this.code = code;
        this.message = message;
        this.httpCode = httpCode;
    }

    public MSException(String message, String code, String message1, Integer httpCode) {
        super(message);
        this.code = code;
        this.message = message1;
        this.httpCode = httpCode;
    }

    public MSException(String message, Throwable cause, String code, String message1, Integer httpCode) {
        super(message, cause);
        this.code = code;
        this.message = message1;
        this.httpCode = httpCode;
    }

    public MSException(Throwable cause, String code, String message, Integer httpCode) {
        super(cause);
        this.code = code;
        this.message = message;
        this.httpCode = httpCode;
    }

    public MSException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String code, String message1, Integer httpCode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
        this.message = message1;
        this.httpCode = httpCode;
    }
}
