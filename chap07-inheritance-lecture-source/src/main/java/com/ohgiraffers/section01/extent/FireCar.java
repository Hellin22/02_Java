package com.ohgiraffers.section01.extent;

public class FireCar extends Car{

    public FireCar(){

        /* 설명. 부모로부터 생성자는 물려받지 않고 super()를 통해 부모 객체를 먼저 생성 */
        super(); // 부모 생성자를 먼저 호출함.
        System.out.println("FireCar 크래스의 기본 생성자 호출");
    }


    @Override

    /* 필기.
    *   @Override 어노테이션을 추가하는 이유?
    *   1. 메서드 중에 부모로부터 물려받은 메서드 인것을 한눈에 알아보기 쉽게 하기위해(가독성)
    *   2. 부모의 메서드를 오버라이딩할때 발생할 수 있는 실수를 방지하기위해 (실수방지 측면)
    * */
    public void soundHorn(){
        System.out.println("ㅃㅃㅃㅃㅃㅃㅃㅃㅃㅃㅃㅃㅃㅃㅃㅃ빵)");
    }


    /* 설명. 부모로부터 물려받는 필드 및 메서드 외에 기능 하나 더 추가(확장)*/
    public void sprayWater(){
        System.out.println("불난 곳을 발견햇씁니다. 물을 뿌립니다. =====================3");

    }
}
