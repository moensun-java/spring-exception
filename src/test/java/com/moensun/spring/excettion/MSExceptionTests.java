package com.moensun.spring.excettion;

import com.moensun.spring.exception.MSException;
import org.junit.jupiter.api.Test;

public class MSExceptionTests {

    @Test
    public void message(){
        throw new MSException("sss");
    }

}
