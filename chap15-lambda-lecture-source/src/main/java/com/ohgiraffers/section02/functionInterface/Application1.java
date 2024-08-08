package com.ohgiraffers.section02.functionInterface;

import java.time.LocalTime;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스 중 Consumer에 대해 이해하고 사용할 수 있다. */
        /* 설명. 반환형이 없는 메서드 관련 람다식 */
//        Consumer<String> consumer = (str) -> {
//            System.out.println(str + "가 입력");
//        };

        /* 설명. 매개변수가 1개이면 생략 가능하며 중괄호도 생략 가능하다.(현재는 return이 없는 구문) */
        Consumer<String> consumer = str -> System.out.println(str + "가 입력됨");
        consumer.accept("hello");

        String a = "!@4";

//        BiConsumer<String, LocalTime> biConsumer =
//                (str, time) -> {
//                    System.out.println(str + "가 " + time + "에 입력됨");
//                };
        BiConsumer<String, LocalTime> biConsumer =
                (str, time) -> System.out.println(str + "가 " + a + time + "에 입력됨");
        biConsumer.accept("hello?", LocalTime.now());

        ObjIntConsumer<Random> objIntConsumer =
                (random, bound) -> System.out.println("0부터 " + bound + "전까지의 난수 발생: " + random.nextInt(bound));
        objIntConsumer.accept(new Random(), 10);

//        ObjIntConsumer<Integer> objIntConsumer2 =
//                (randomNum, bound) -> System.out.println("0부터 " + bound + "전까지의 난수 발생: " + Math);
//        objIntConsumer2.accept(new Random(), 10);
        // 생각해봤는데 Math.rand()를 사용하는 경우에는 파라미터가 1개만 필요하다.
        // 따라서 ObjIntCounsumer를 사용하지 않는게 맞다.
    }
}
