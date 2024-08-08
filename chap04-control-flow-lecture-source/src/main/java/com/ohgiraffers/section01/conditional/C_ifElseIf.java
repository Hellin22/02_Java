package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {

    public void testSimpleIfElseIfStatement() {
        System.out.println("셋중 머가 니도끼냐 금, 은, 쇠다.");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if (answer == 1) {
            System.out.println("거짓말");
        } else if (answer == 2) {
            System.out.println("그짓말");
        } else {
            System.out.println("착하니까 다 가져가라");
        }
        System.out.println("사라짐.");
    }

    public void testNestedIfElseIfStatement() {
        /* 설명.
         *   ohgiraffers 대학의 김xx 교수는 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는
         *   채점방식을 사용하고 있다.
         *   90이상은 'A' 그밑으로는 10점씩 깎으면서 'B', 'C', 'D'이고 60미만은 'F' 학점을 준다.
         *   그래서 학생 이름과 점수를 입력하면 자동으로 등급을 계산하는 프로그램을 만들기로 했다.
         *   (추가로, 각 등급의 중간점수(95, 85, ...) 이상인 경우 '+'를 부텽서 등급을 세분화 하자.)
         *
         * 설명.
         *  출력 예시 : XXX 학생의 점수는 86점이고, 등급은 B+입니다.
         *            프로그램을 종료합니다.
         */
        System.out.print("점수 입력하쇼: ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String grade;
        if (score >= 95) {
            grade = "A+";
        } else if (score >= 90) {
            grade = "A";
        } else if (score >= 85) {
            grade = "B+";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 75) {
            grade = "C+";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 65) {
            grade = "D+";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.print("score = " + score + " ");
        System.out.println("grade = " + grade);
    }
}
