package com.ohgiraffers.section03.filterstream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/* 설명. 우리만의 헤더 추가가 안되는 ObjectOutputStream 만들어 보기 */
public class MyOutput extends ObjectOutputStream {
    public MyOutput(OutputStream out) throws IOException {
        super(out);
    } // 생성자를 물려받은건 아니고 부모의 예외를 처리해주기 위해서임.

    @Override
    protected void writeStreamHeader() throws IOException {

        /* 설명. 객체 출력 시 헤더의 개념이 추가되지 않도록 기능 삭제*/
    }
}
