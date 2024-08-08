package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public void testSimpleIfElseStatement() {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요: ");
        int input = sc.nextInt();

        if (input % 2 != 0) {
            System.out.println("홀수 입니다.");
        } else {
            System.out.println("짝수 입니다.");
        }
    }

    public void testNestedIfElseStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 입력: ");

        /* 설명. 정수를 하나 입력받아 양수, 음수 구분하고 양수일때만 짝수인지 판별(각 상태 모두 출력)*/
        int input = sc.nextInt();
        if (input >= 0) {
            if(input % 2 == 0) {
                System.out.println("양수 짝수");
            } else {
                System.out.println("양수 홀수");
            }
        } else{
            System.out.println("음수인 경우");
        }
    }
}
