package com.moensun.spring.exception;


import com.moensun.spring.context.SpringContextHolder;
import com.moensun.spring.resource.MSResourceBundle;
import org.springframework.context.ApplicationContext;

import java.util.Objects;

/**
 * Created by Bane.Shi.
 * Copyright MoenSun
 * User: Bane.Shi
 * Date: 2016/11/25
 * Time: 22:00
 */
public class MSException extends MSBaseException {

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

    public MSException(String code, Object... params) {
        this(null, null, code, params);
    }

    public MSException(Integer httpCode, String code, Object... params) {
        this(httpCode, null, code, params);
    }

    public MSException(Throwable cause, String code, Object... params) {
        this(null, cause, code, params);
    }

    public MSException(Integer httpCode, Throwable cause, String code, Object... params) {
        super(code, cause);
        this.httpCode = httpCode;
        this.code = code;
        ApplicationContext applicationContext = SpringContextHolder.getApplicationContext();
        if (Objects.nonNull(applicationContext)) {
            this.msResourceBundle = SpringContextHolder.getApplicationContext().getBean(MSResourceBundle.class);
            this.message = msResourceBundle.text(code, params);
        }else {
        	this.code = "";
        	this.message = code;
		}
    }

    @Override
    public String toString() {
        return "MSException{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", msResourceBundle=" + msResourceBundle +
                '}';
    }
}
