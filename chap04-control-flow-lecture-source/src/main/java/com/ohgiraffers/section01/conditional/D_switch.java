package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public static void testSimpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);

        int point = 0;

        switch (grade) {
            case 'G':
                point += 10;

            case 'S':
                point += 10;

            case 'B':
                point += 10;
                break;
            default:
                System.out.println("제대로 써라");
        }

        /* 설명. G/S/B 중 하나를 입력하면 해당등급의 point를 보여주고 아니면 회원가입 유도 */
        // grade를 반복해서 길게 적는게 별로면 flag를 도입해서 진행하기
        if (grade =='G' || grade == 'S' || grade == 'B') {
            System.out.println("당신 등급은 " + grade + "이며, 포인트는 " + point);
        }else{
            System.out.println("회원가입이나 하쇼");
        }

    }
}
