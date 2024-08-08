package com.ohgiraffers.section01.exception;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 예외에 대해 이해하고 이를 처리하기 위한 문법을 활용할 수 있다. */
        /* 필기.
         *  1. throws를 통한 위임
         *  2. try-catch를 통한 처리
         * */

        ExceptionTest et = new ExceptionTest();

        try{
            et.checkEnoughMoney(10000, 50000);
            et.checkEnoughMoney(50000, 10000);
        }catch ( Exception e ){
            System.out.println("뭔가 예외가 생겻네");
            System.out.println("그 예외는 " + e.getMessage() + "!!!!");
        }

    }
}
