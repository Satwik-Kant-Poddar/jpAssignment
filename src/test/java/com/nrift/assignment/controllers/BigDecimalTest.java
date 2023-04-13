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
        String expOutput="123,456";
        String actOutput=bigDecimal.function("123456");
        assertEquals(actOutput,expOutput);
    }

    @Test
    public void  test2(){
        String expOutput="-123,456";
        String actOutput=bigDecimal.function("-123456");
        assertEquals(actOutput,expOutput);
    }
    @Test
    public void  test3(){
        String expOutput="12,345.6";
        String actOutput=bigDecimal.function("12345.6");
        assertEquals(actOutput,expOutput);
    }

    @Test
    public void  test4(){
        String expOutput="-123,456";
        String actOutput=bigDecimal.function("-123456");
        assertEquals(actOutput,expOutput);
    }
}
