package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Stream에 대해 이해하고 활용할 수 있다. */
        /* 설명.
        *   Arrays.asList(): 매개변수로 요소들을 전달하면 List로 반환
        *   ArrayList<>(Collection 타입): Collection 타입을 ArrayList 객체로 생성할 때 쓰이는 생성자
        * */
        String[] arr = {"A" , "B" , "C" , "D" , "E" , "F" , "G"};
//        List<String> arr2 = Arrays.asList(arr);
        List<String> stringList = new ArrayList<>(Arrays.asList("hello", "world", "stream"));
//        List<String> stringList2 = new ArrayList<>(Arrays.asList(arr));

        System.out.println("====== foreach ");
        for (String str : stringList) {
            System.out.println(str);
        }

        System.out.println("====== stream");
//        stringList.stream().forEach((String x) -> System.out.println(x));
//        stream으로 바뀐 ArrayList의 요소들이 각각 람다식에 적용되어 동작
        stringList.stream().forEach(System.out::println);
    }
}
