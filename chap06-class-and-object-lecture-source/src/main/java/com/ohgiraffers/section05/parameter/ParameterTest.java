package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class ParameterTest {
    public void testPrimitiveTypeParameter(int num) {
        num = 10;
        System.out.println("매개변수로 전달받은 값: " + num);
    }

    public void testPrimitiveTypeArrayParameter(int[] iArr) { // 얕은 복사가 일나는거임.
        iArr[0] = 100;
        System.out.println("매개변수로 전달받은 값: " + Arrays.toString(iArr));
    }

    public void testClassTypeParameter(Rectangle rectangle) {
        rectangle.calArea();
        rectangle.calRound();
        rectangle.setHeight(3214);
    }

    public void testVariableLengthArrayParameter(String... str) {
        System.out.println("str = " + Arrays.toString(str));
    }
}
