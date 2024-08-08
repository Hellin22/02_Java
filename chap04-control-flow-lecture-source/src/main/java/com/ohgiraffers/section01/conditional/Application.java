package com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {

        A_if aClass = new A_if();
        aClass.testSimpleIfStatement();
        aClass.testNestedIfStatement();

        B_ifElse bClass = new B_ifElse();
        bClass.testSimpleIfElseStatement();
        bClass.testNestedIfElseStatement();

        C_ifElseIf cClass = new C_ifElseIf();
        cClass.testSimpleIfElseIfStatement();
        cClass.testNestedIfElseIfStatement();

        /* 설명. switch문 흐름 확인용 메서드 호출 */
        D_switch.testSimpleSwitchStatement();

    }
}