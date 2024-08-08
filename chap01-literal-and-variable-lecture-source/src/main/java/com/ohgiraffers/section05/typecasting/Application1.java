package com.ohgiraffers.section05.typecasting;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 자동 형변환(Implicit Coercion) 규칙에 대해 이해할 수 있다. */
        byte bNum = 1;

        short sNum = bNum;      // 내부적으로 short로 자동 형변환이 됨.
        int iNum = sNum;

        /* 설명. 연산 시에도 자동으로 큰 자료형에 맞춰서 낮은 자료형이 자동형변환 된다. */
        int num1 = 10;
        long num2 = 20L;

        long result1 = num1 + num2;
        System.out.println("result1 = " + result1);

        /* 설명. 문자형은 int형으로 자동형변환 가능하다. */
        int ch1 = 'a';
        System.out.println("ch1 = " + ch1);

        /* 설명. int형에서 char형에 담기는건 작은 범위로 대입되지만 가능하다. */
        char ch2 = 65;

        int a = -2;
        char c = (char)a;
        System.out.println("c = " + c);
    }
}
