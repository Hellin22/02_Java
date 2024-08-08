package com.ohgiraffers.section03.overriding;

/* 설명. class가 final 키워드가 붙으면 부모 클래스가 될 수 없다.*/

// public final class SuperClass {
public class SuperClass {

    /* 수업목표. 오버라이딩(Overriding)에 대해 이해할 수 있다. */

    public void method(int num){

    }
    public Object method2(int num){
        return null;
    }
    private void privateMethod(){}

    public final void finalMethod(){} // 더이상 내 자식에게 물려주지 않는것.

    protected void protectedMethod(){}

    /* 설명. default 접근 제어자는 접근 제어자를 쓰지 않는 것이다.*/
    void defaultMethod(){}
}
