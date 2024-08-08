package com.ogiraffers.section03.interfaceimplements;

public class Application{
    public static void main(String[] args) {

        /* 수업목표. 인터페이스(interface)에 대해 이해할 수 있다. */
        /* 필기.
        *   인터페이스란?
        *    자바의 클래스와 유사한 형태지만 상수필드(public static final)과
        *    추상메서드(public abstract)만 가질 수 있는 클래스의 변형체
        *    -> 다른 클래스들이 가져다 써야하기 때문에 public으로 구현
        * */

        /* 설명. 인터페이스는 객체 생성 불가능 */
//        InterProduct ip1 = new InterProduct();
        InterProduct ip1;

        Product p = new Product();
        //InterProduct p = new Product();
        p.nonStaticMethod2();

        InterProduct.staticMethod();
        p.defaultMethod();
    }
}
