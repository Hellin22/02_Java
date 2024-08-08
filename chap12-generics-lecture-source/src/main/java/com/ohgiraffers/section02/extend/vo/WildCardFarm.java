package com.ohgiraffers.section02.extend.vo;

/* 설명.
*   와일드카드(wildcard)
*      제네릭 클래스의 타입의 객체를 메서드의 배개변수로 받을 때 타입 변수를 제한할 수 있다.
*      <?>: 제한 없음
*      <? extends Type>: 와일드카드의 상한 제한(Type과 Type의 후손을 이용해 생성된 제네릭 인스턴스만 가능) // 제네릭 인스턴스 -> 어떤 농장 의미
*      <? super Type>: 와일드카드의 하한 제한(Type과 Type의 부모를 이용해 생성된 제네릭 인스턴스만 가능)
* */
/* 설명. 제네릭 타입을 활용하는 기능을 포함한 클래스 */
public class WildCardFarm {

    /* 설명. 어떤 타입의 RabbitFarm(제네릭 타입)이 와도 상관 없다. */
    // RabbitFarm은 Rabbit을 extends를 하는 제네릭을 사용하고있다.
    // -> RabbitFarm이라는 제한사항은 존재한다.
    // public class RabbitFarm <T extends Rabbit>
    public void anyType(RabbitFarm<?> farm){        // 토끼가 뛰어노는 토끼 농장이면 상관 없다.
        farm.getAnimal().cry();
    }

    /* 설명. RabbitFarm 중에서도 Bunny 또는 하위 타입이 있는 RabbitFarm만 가능 */
    public void extendsType(RabbitFarm<? extends Bunny> farm){
        farm.getAnimal().cry();
    }

    /* 설명. RabbitFarm 중에서도 Bunny 또는 상위 타입이 있는 RabbitFarm만 가능*/
    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }
}
