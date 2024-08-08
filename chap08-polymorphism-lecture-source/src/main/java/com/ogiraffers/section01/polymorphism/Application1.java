package com.ogiraffers.section01.polymorphism;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 다형성과 타입 형변환에 대해 이해할 수 있다. */
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();
        System.out.println();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();
        System.out.println();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        /* 설명. 다형성 적용(부모 타입으로 자식 인스턴스의 주소값 저장) */
        Animal an1 = new Animal();              // 다형성 x
        Animal an2 = (Animal)new Tiger();       // 다형성 o
        Animal an3 = (Animal)new Rabbit();      // 다형성 o

        /* 설명. Animal은 Tiger나 Rabbit이 아니다. */
        // Tiger t1 = new Animal();                // 다형성 x

        /* 설명. 동적 바인딩 확인하기 */
        /* 필기.
        *    컴파일 당시에는 해당 타입의 메서드와 연결되어 있다가
        *    런타임 당시 실제 객체가 가진 오버라이딩 된 메서드로 바인딩이 바뀌어 동작하는 것을 의미한다.
        *    (동적 바인딩의 조건: 1. 상속, 2. 오버라이딩)
        * */
        System.out.println("====== 동적 바인딩 확인하기 ======");
        an1.cry();
        an2.cry();
        an3.cry();

        /* 설명. 부모 타입을 자식 타입으로 강제 형변환 하는 것은 가능 -> 조심해야함 */
//       ((Tiger)an3).cry(); // 컴파일 시점에 에러가 발생하지 않고 런타임 시점에 에러 발생

        /* 설명. 오버라이딩 되지 않은(추가한 메서드) 메서드 호출은 다운캐스팅을 해주어야한다. */
        /* 필기.
        *   instanceof란?
        *    해당 객체의 타입을 런타임 시점에 확인하기 위한 연산자
        * */

        if(an3 instanceof Tiger){
            ((Tiger)an3).cry();
        }

        if(an3 instanceof Rabbit){
            System.out.println("토?끼니?");
            ((Rabbit) an3).jump();
//            an3.jump(); // 에러
        }

        if(an3 instanceof Animal){
            System.out.println("animal은 맞나?");
        }

        /* 설명. 다형성은 상속관계의 객체들간에 형변환 */
        Animal animal2 = new Tiger();   // 다형성을 적용, 자동형변환(auto up-casting), 묵시적 형변환
        Rabbit rabbit2 = (Rabbit)an3;   // 다형성이 적용되지 않음, 강제형변환(down-casting), 명시적 형변환
    }
}

