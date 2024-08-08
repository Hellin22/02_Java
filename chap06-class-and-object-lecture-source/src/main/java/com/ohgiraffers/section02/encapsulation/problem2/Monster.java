package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {
//    String name;
//    int hp;

    /* 설명. 메서드를 추가하여 필드가 수정되어도 이 클래스 내에서만 에러가 발생(단일책임의 원칙)*/
    String kinds;
    int mp;

    public void setInfo1(String info1){
        this.kinds = info1;
    }

    public void setinfo2(int info2){
        this.mp = info2;
    }

}
