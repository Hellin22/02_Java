package com.ogiraffers.section02.abstractclass;

public class SmartPhone extends Product{

    public SmartPhone(){

        /* 설명. 추상 클래스라도 자식 객체를 위해서는 객체가 생성된다. */
        super();
    }

    /* 설명. 추상 메서드를 물려받은 자식 클래스(온전한)는 반드시 오버라이딩 해야함. (강제성 부여, 규약) */
    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스로부터 물려받은 abstractMethod를 오버라이딩한 메서드 호출됨.");
    }

    /* 설명. 추가적인 메서드도 작성할 수 있다.*/
    public void printSmartPhone(){
        System.out.println("SmartPhone 클래스의 printSmartPhone 메서드 호출함....");
    }
}
