package com.ohgiraffers.section03.additional;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class AdditionalAnnotationTests {

    /* 수업목표. Junit5에서 제공하는 메서드 관련 추가 어노테이션을 사용할 수 있다. */
    @Disabled
    @Test
    public void testIgnore(){}

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void testTimeout() throws InterruptedException {
        System.out.println(3123414);
        Thread.sleep(990);
    }

    @Test
    @Order(3)
    public void testThird(){
        System.out.println(3);
    }
    @Test
    @Order(1)
    public void testFirst(){
        System.out.println(1);
    }
    @Test
    @Order(2)
    public void testSecond(){
        System.out.println(2);
    }

    @RepeatedTest(5)
    public void testRepeat(){
        System.out.println("SDgafdsg");
    }
}
