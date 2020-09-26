package com.moensun.spring.excettion;

import com.moensun.spring.exception.MSBusinessException;
import org.junit.jupiter.api.Test;

public class MSBusinessExceptionTests {

    @Test
    public void message(){
        MSBusinessException ex = new MSBusinessException("sss");
        if(ex instanceof  MSBusinessException){

        }
    }

}
