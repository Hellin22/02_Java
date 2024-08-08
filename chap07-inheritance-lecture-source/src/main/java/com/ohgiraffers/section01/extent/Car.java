package com.ohgiraffers.section01.extent;

public class Car {

    private boolean runningStatus;

    public Car(){
        super();
        System.out.println("car 클래스의 기본 생성자 호출함.....");
    }

    public void run(){
        System.out.println("자동차 달리기 시작합니다.");
        runningStatus = true;
    }

    public void soundHorn(){
        if(runningStatus){
            System.out.println("빵빵");
        }else{
            System.out.println("시동부터 거세여");
        }
    }

    public boolean isRunning(){
        return runningStatus;
    }

    public void stop(){
        runningStatus = false;
        System.out.println("차가 멈췄습니다");
    }
}
