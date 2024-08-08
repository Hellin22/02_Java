package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTowToNine() {

        for (int i = 2; i < 10; i++) {              // 단(행, row)
            System.out.println(i + "단 곱셈");
            printGugudanOf(i);
            System.out.println();
        }
    }

    /* 설명. 단수를 넘겨주면 해당 단수의 곱셈 출력 기능 메서드 */
    private static void printGugudanOf(int dan) {
        for (int j = 1; j < 10; j++) {          // 수(컬럼, column)
            System.out.println(dan + " * " + j + " = " + (dan * j));
        }
    }


    /* 설명. 별찍기를 해보자. 우측 하단으로 커지는 방법으로 */
    public void printStars(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 ");
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            placeStars(i);
            System.out.println();
        }
    }

    private static void placeStars(int i) {
        for(int j = 0; j <= i; j++){
            System.out.print('*');
        }
    }

    /* 설명. 좌측 하단으로 커지는 별찍기 진행해보기 */
    public void printStars2(){
        System.out.print("정수 입력 ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 0; i < input; i++){
            placeSpace(input, i);
            placeStars2(i);
            System.out.println();
        }
    }

    private static void placeStars2(int i) {
        for(int j = 0; j <= i; j++){
            System.out.print('*');
        }
    }

    private static void placeSpace(int input, int i) {
        for(int j = input -1; j > i; j--){
            System.out.print(' ');
        }
    }
}
