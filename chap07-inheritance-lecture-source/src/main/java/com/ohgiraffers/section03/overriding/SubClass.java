package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass{

    /* 설명. 부모 메서드와 이름, 반환형, 매개변수, 접근제어자 모두 동일하게 오버라이딩 */

    @Override
    public void method(int num) {

    }

    /* 설명. 메서드 이름 변경(새로운 메서드 생성한거) */
//    @Override
//    public void method1(int num) {
//
//    }

    /* 설명. 메서드 리턴 타입 변경(새로운 메서드 생성한거)*/
//    @Override
//    public String method(int num) {
//        return null;
//    }

    /* 설명. 경우에 따라서는 메서드의 반환경을 달리 할 수 있다.
    *   (부모 메서드의 리턴타입의 자식 타입으로는 가능)*/
    @Override
    public String method2(int num) {
        return null;
    }

    /* 설명. private 메서드는 오버라이딩 불가 */
//    @Override
//    private void privateMethod(){
//
//    }

    /* 설명. final 메서드는 오버라이딩 불가 */
//    public final void finalMethod(){
//
//    }

    /* 설명. 부모타입이 protected면 어디서든(어느 패킺지든) 접근해서 오버라이딩 가능*/
//    @Override
//    protected void protectedMethod() {} // protected -> public

    /* 설명. 부모 메서드의 접근 제어자와 같은 버무이이거나 더 넓은 범위는 가능 */
    @Override
    public void protectedMethod() {} // protected -> public

    /* 설명. */
    @Override
//    private void defaultMethod() {}
    public void defaultMethod() {}




}
