package com.ogiraffers.section03.interfaceimplements;

import java.io.Serializable;

public class Product implements InterProduct, Serializable {

    @Override
    public void nonStaticMethod2() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩 메서드 호출....");
    }

    @Override
    public void defaultMethod() {
        InterProduct.super.defaultMethod();
    }
}
