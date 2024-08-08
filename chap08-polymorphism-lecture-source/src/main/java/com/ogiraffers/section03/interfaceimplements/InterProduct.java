package com.ogiraffers.section03.interfaceimplements;

public interface InterProduct extends ParentInterProduct, AnotherParentInterProduct{

//    public static final int MAX_NUM = 100;
    int MAX_NUM = 100;                   // 상품은 최대 100개만 저장 가능하고 이 값을 활용해라.
//    private static final int MIN_NUM = 10;        // public을 다른걸로 변형해서 쓸 수 없다.

    /* 설명. 인터페이스는 생성자를 가질 수 없다. */
//    public InterProduct(){}

    /* 설명. 기본적으로 추상메서드만 가능하다.*/
//    private void nonStaticMethod();
//    public abstract void nonStaticMethod();
    void nonStaticMethod2();

    /* 설명. static 메서드는 바디부까지 작성을 허용했다. (JDK 1.8부터 추가된 기능) */
    public static void staticMethod(){
        System.out.println();
    }

    /* 설명. non-static 메서드라도 default 키워드를 추가하면 바디부까지 작성을 허용했다.(JDK 1.8부터) */
    public default void defaultMethod(){
        privateMethod();
    }

    /* 설명. private도 abstract가 아닌 온전한 메서드로 사용 가능하다. (default도 없이) */
    private void privateMethod(){
        System.out.println("AEWfawe");
        /* 설명. 다른 public default 메서드에서 활용할 수만 있는 기능 */
        // -> default 메서드 (바로 위에있는거) 내부에서 쓰이는 기능을 함수로 빼낸거라고 생각하면됨.
    }
}
