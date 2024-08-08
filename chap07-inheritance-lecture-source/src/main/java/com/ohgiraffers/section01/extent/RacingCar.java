package com.ohgiraffers.section01.extent;

public class RacingCar extends Car{

    public RacingCar(){
    }

    @Override
    public void run() {
        System.out.println("레이싱 자동차가 신나게 달립니다");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적이 업성욧");
    }
}
