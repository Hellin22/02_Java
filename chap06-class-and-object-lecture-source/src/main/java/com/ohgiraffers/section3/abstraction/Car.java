package com.ohgiraffers.section3.abstraction;

public class Car {
    private boolean isOn = false;
    private int speed;

    public void startUp() {
        if (this.isOn) {      // 시동이 걸려 있다면
            System.out.println("이미 시동 on");
        } else {              // 시동이 꺼져 있다면
            this.isOn = true;
            System.out.println("시동 on 했슴다");
        }
    }

    public void go() {
        if (isOn) {               // 시동이 켜져 있어야 달릴 수 있음.
            speed += 10;
            System.out.println("차가 앞으로 갑니다. 현재 속도는 " + speed);
        } else {
            System.out.println("차 시동 먼저 거세요");
        }
    }

    public void stop() {
        if (isOn) {
            if (speed > 0) {
                speed = 0;
                System.out.println("차가 멈췃습니다");
            }else{
                System.out.println("이미 멈춰잇어요");
            }
        } else {
            System.out.println("차의 시동이 걸려있지 않아요");
        }
    }

    public void turnOff() {
        if (isOn) {
            if (speed > 0) {
                System.out.println("달리는 상태에서는 시동 못끔니다. 멈춰주세요");
            } else {
                isOn = false;
                System.out.println("시동 끕니다");
            }
        } else {
            System.out.println("이미 시동 꺼져있어요");
        }
    }
}
