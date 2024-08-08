package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 여러가지 값의 형태를 출력할 수 있다. */
        /* 목차. 1. 숫자 형태의 값 */
        /* 목차. 1-1. 정수 형태의 값 출력 */
        System.out.println(123); // println -> print line -> 개행문자가 들어감.

        /* 목차. 1-2. 실수 형태의 값 출력 */
        System.out.println(1.234);

        /* 목차 2. 문자 형태의 값 출력 */
        System.out.println('a');
        System.out.println('1');
//        System.out.println('');     // 빈 문자는 빈 문자열처럼 사용 못함.
        System.out.println('\u0000'); // 빈 문자 의미 -> unicode 0번

        // ctrl + j -> 예약어를 확인 가능 ctrl + shift + / 를 하면 여러줄 주석 나오긴 함.

        /* 목차. 3. 문자열 형태의 값 출력 */
        System.out.println("안녕하세요");
        // sout
        System.out.println("a");
        System.out.println("");

        /* 목차. 4. 논리 형태의 값 출력 */
        System.out.println(true);
        System.out.println("true");
        System.out.println(false); // 자바는 1, 0을 안쓰고 t, f만 사용한다.
//        System.out.println(abc);









    }
}