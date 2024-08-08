package com.ogiraffers.section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용하여 객체 배열을 만들어 다양한 인스턴스들을 연속 처리할 수 있다. */
        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

//        for(int i = 0; i < animals.length; i++){
//            animals[i].cry();
//        }

        /* 설명. 오버라이딩 되지 않은 메서드는 추가 처리 필요 */
        for (Animal animal : animals){      // 런타임 에러 방지 코드
            animal.cry();
            if(animal instanceof Tiger){
                ((Tiger) animal).bite();
            }else{
                ((Rabbit) animal).jump();
            }
        }




    }


}
