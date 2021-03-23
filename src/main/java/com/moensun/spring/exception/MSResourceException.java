package com.moensun.spring.exception;

import com.moensun.spring.context.SpringContextHolder;
import com.moensun.spring.resource.MSResourceBundle;
import org.springframework.context.ApplicationContext;

import java.util.Objects;

public abstract class MSResourceException extends MSException {
    private String code;
    private String message;
    private Integer httpCode;
    private transient MSResourceBundle msResourceBundle;

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

    public MSResourceBundle getMsResourceBundle() {
        return msResourceBundle;
    }

    public MSResourceException(String code, Object... params) {
        this(null, null, code, params);
    }

    public MSResourceException(Integer httpCode, String code, Object... params) {
        this(httpCode, null, code, params);
    }

    public MSResourceException(Throwable cause, String code, Object... params) {
        this(null, cause, code, params);
    }

    public MSResourceException(Integer httpCode, Throwable cause, String code, Object... params) {
        super(code, cause);
        this.httpCode = httpCode;
        ApplicationContext applicationContext = SpringContextHolder.getApplicationContext();
        if (Objects.nonNull(applicationContext)) {
            this.msResourceBundle = SpringContextHolder.getApplicationContext().getBean(MSResourceBundle.class);
            this.message = msResourceBundle.text(code, params);
            if (Objects.isNull(this.message)) {
                this.message = code;
            } else {
                this.code = code;
            }
        } else {
            this.message = code;
        }
    }

    @Override
    public String toString() {
        return "MSException{" +
                "code='" + code + '\'' +
                ", message='" + message +
                '}';
    }
}
