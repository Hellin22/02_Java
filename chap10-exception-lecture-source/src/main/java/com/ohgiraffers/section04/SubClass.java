package com.ohgiraffers.section04;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {

    /* 설명. 부모 메서드의 예외와 같은 범위 처리(pass) */
//    @Override
//    public void method() throws IOException {
//
//    }

    /* 설명. 부모 메서드와 달리 예외 발생 x (pass)*/
//    @Override
//    public void method() {
//
//    }

    /* 설명. 부모 메서드보다 더 낮은(적은) 범위의 예외 발생(pass) */
//    @Override
//    public void method() throws FileNotFoundException {
//
//    }

    /* 설명. 부모 메서드보다 상위 타입의 예외 발생(fail) - 컴파일에러 */
    @Override
    public void method() throws Exception {

    }
}
