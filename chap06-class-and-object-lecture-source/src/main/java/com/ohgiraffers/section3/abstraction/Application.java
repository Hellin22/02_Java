package com.ohgiraffers.section3.abstraction;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 객체지향 프로그래밍에 대해 이해하고 객체와 클래스를 설계해 추상화를 이해할 수 있다. */
        /* 필기.
         *   추상화란?
         *    공통된 부분을 추출하고 공통되지 않고 불필요한 부부능ㄹ 제거한다는 의미를 가지며, 추사오하의 목적은
         *    유연성을 확보하기 위함.
         *    유연성 확보는 여러곳에 적용될 수 있는 유연한 객체를 의맣며, 재사용성이 높아질 수 있게 한다는 의미
         *    (우리는 이미 자연스럽게 추상화를 이루었찌만 그렇게 추상화된 클래스로 유연한 객체들을 생성할 수 있다.)
         *
         * 필기.
         *   1. 협력(애플리케이션 구현에 필요한 객체간 상호작용)
         *   2. 책임(객체가 협력에 참여하기위해 수행해야할 기능)
         *   3. 역할(객체의 책임이 모여 하나의 역할이 됨)
         * */

        Scanner sc = new Scanner(System.in);
        CarRacer racer = new CarRacer();
        CarRacer racer2 = new CarRacer();
        int input = 0;

        do {
            System.out.println("===== 카레이싱 프로그램 =====");
            System.out.println("1. 시동 걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택: ");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    racer.startUp();
                    break;
                case 2:
                    racer.stepAccelator();
                    break;
                case 3:
                    racer.stepBreak();
                    break;
                case 4:
                    racer.turnOff();
                    break;
                case 9:
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("제대로 입력 주세요");
            }
        } while (true);
    }
}
