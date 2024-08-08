package com.ogiraffers.section02.abstractclass;

public abstract class Product {
    private int nonStaticField;
    private static int staticField;

    public Product(){
    }

    public void nonStaticMethod(){}

    public static void staticMethod(){}

    /* 설명. 추상메서드가 하나 이상 존재하면 해당 클래스는 반드시 추상클래스가 된다. */
    public abstract void abstractMethod();
}
