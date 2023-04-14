package com.nrift.assignment.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BigDecimalTest {
    @Autowired
    BigDecimal bigDecimal;

    @Test
    public void  test1(){
        String expOutput="1,234.50";
        String actOutput=bigDecimal.function("1234.50");
        assertEquals(actOutput,expOutput);
    }
    
    @Test
    public void  test2(){
        String expOutput="-1,234.50";
        String actOutput=bigDecimal.function("-1234.50");
        assertEquals(actOutput,expOutput);
    }
    
    @Test
    public void  test3(){
        String expOutput="0.345";
        String actOutput=bigDecimal.function("0.345");
        assertEquals(actOutput,expOutput);
    }
    
    @Test
    public void  test4(){
        String expOutput="12,345,678.0923";
        String actOutput=bigDecimal.function("12345678.0923");
        assertEquals(actOutput,expOutput);
    }
    
    @Test
    public void  test5(){
        String expOutput="234.50";
        String actOutput=bigDecimal.function("234.50");
        assertEquals(actOutput,expOutput);
    }

    @Test
    public void  test6(){
        String expOutput="123,456";
        String actOutput=bigDecimal.function("123456");
        assertEquals(actOutput,expOutput);
    }

    @Test
    public void  test7(){
        String expOutput="-123,456";
        String actOutput=bigDecimal.function("-123456");
        assertEquals(actOutput,expOutput);
    }

    @Test
    public void  test8(){
        String expOutput="12,345.6";
        String actOutput=bigDecimal.function("12345.6");
        assertEquals(actOutput,expOutput);
    }

    @Test
    public void  test9(){
        String expOutput="-123,456";
        String actOutput=bigDecimal.function("-123456");
        assertEquals(actOutput,expOutput);
    }

    @Test
    public void  test10(){
        String expOutput="0";
        String actOutput=bigDecimal.function("0");
        assertEquals(actOutput,expOutput);
    }

    
}
