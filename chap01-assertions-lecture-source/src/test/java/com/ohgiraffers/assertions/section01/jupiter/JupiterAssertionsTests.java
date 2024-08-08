package com.ohgiraffers.assertions.section01.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/* 수업목표. junit5에서 제공하는 Assertions에 있는 메서드에 대해 이해하고 활용할 수 있다.*/
/* 목차. 1. assertEquals */
/* 필기. assertEquals(expected, actual) 메서드는 실제값과 일치 여부를 동일성으로 판단 */
class JupiterAssertionsTests {

    @Test
    public void testAssertEquasl(){

        /* 설명. 1. given */
        int firstNum = 10;
        int secondNum = 20;
        int expected = 31;

        /* 설명. 2. when */
        Calculator calculator = new Calculator();
        int result = calculator.plusTwoNumbers(firstNum, secondNum);

        /* 설명. 3. then */
//        Assertions.assertNotEquals(expected, result);
        Assertions.assertNotEquals(expected, result);
        Assertions.assertEquals(expected, result, 1);       // 오차범위에 해당하는 매개변수 제공
    }

    @Test
    @DisplayName("null인지 테스트")
    void testAssertNull(){
        String str;
        str= null;
        Assertions.assertNull(str);
    }

    @Test
    @DisplayName("notnull인지 테스트")
    void testAssertNotNull(){
        String str;
        str= "abc";
        Assertions.assertNotNull(str);
    }

    @Test
    @DisplayName("동시에 여러 가지 값에 대한 검증을 수행하는 경우 테스트 ")
    void testAssertAll(){
        String firstName = "길동";
        String lastName = "동";

        Person person = new Person(firstName, lastName);
        Assertions.assertAll(
                "그룹화된 테스트의 이름(테스트 실패시 보여짐)",
                () -> Assertions.assertEquals(firstName, person.getFirstName(), () -> "firstName이 잘못됨"),
                () -> Assertions.assertEquals(lastName, person.getLastName(), () -> "lastName이 잘못됨")
        );
    }

    @Test
    @DisplayName("void 메서드의 경우 exception이 발생하는지 테스트")
    void testAssertThrows(){
        int firstNum = 10;
        int secondNum = 0;

        String expectedErrorMessage = "0으로 나눌 수 없습니다.";

        NumberValidation validator = new NumberValidation();
        Exception exception = Assertions.assertThrows(
                Exception.class,
                () -> validator.checkDivedableNumbers(firstNum, secondNum)
        );

        Assertions.assertAll(
                () -> Assertions.assertInstanceOf(IllegalArgumentException.class, exception,
                        () -> "예외타입이 일치하지 않음"),
                () -> Assertions.assertEquals(expectedErrorMessage, exception.getMessage(),
                        () -> "예외 메시지가 일치하지 않음.")
        );

    }
}