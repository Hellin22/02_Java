package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 값을 직접 연산하여 출력할 수 있다. */
        System.out.println("======= 정수와 정수의 연산 ========");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);           // shift + enter -> 아예 줄 바꾸기

        System.out.println("========= 실수와 실수의 연산 ========");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);         // -> 0.2299999...가 된다. -> 실수는 근사치를 통해서 계산하기 때문

        System.out.println("정수와 실수의 연산");
        System.out.println(123 / 5.0);

        System.out.println("문자와 정수 연산");    // 문자는 아스키코드로 인식
        System.out.println('a'+2);
        System.out.println('a'/2);
        System.out.println('a'%2);
        System.out.println((int)'a');

        /* 문자열과 문자열 연산은 '+'만 가능하고 이어붙이기 효과가 발생한다.*/
        System.out.println("문자열과 문자열의 연산");
        System.out.println("hello" + "world");      // +만 적용 가능함.

//        System.out.println("hello" + "world");
        System.out.println("문자열과 다른 형태의 값 연산");
        System.out.println("hello "  + 2123);
        System.out.println("hello "  + true);
        System.out.println(123 + 1 + "hello " + (123.0 + 2));

        System.out.println("논리값과 문자열 형태의 값 연산");
        System.out.println(true + "문자열");
    }
}
