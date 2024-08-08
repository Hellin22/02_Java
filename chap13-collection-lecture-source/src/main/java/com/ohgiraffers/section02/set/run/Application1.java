package com.ohgiraffers.section02.set.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Set 자료구조의 특성을 이해하고 hashSet을 이용할 수 있다. */
        HashSet<String> hset = new HashSet<String>();

        hset.add(new String("java"));
        hset.add(new String("mariaDB"));
        hset.add(new String("servlet"));
        hset.add(new String("spring"));
        hset.add(new String("html"));

        /* 설명. Set에 저장된 자료는 넣는 순서를 보장할 수 없다.(다르다) */
        System.out.println("hset = " + hset);

        /* 설명. 중복값(동등객체)은 Set에 추가되지 않는다.(e, h 오버라이딩 필요) */
        /* 설명. 중복 되는 값이 있으면 새로 추가하려는 객체가 튕겨나가는 구조(덮어쓰지 않음) -> 기존값 활용 */
        hset.add(new String("mariaDB"));
        hset.add(new String("mariaDB1"));
        System.out.println("hset = " + hset);


        /* 설명. Set은 인덱스 개념이 없어 iterator(반복자)를 활용해야 한다. */
        Iterator<String> it1 = hset.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next().toString().getClass());
        }

        /* 설명. 배열로 바꾸면 배열의 개념으로 활용할 수 있다. */
        Object[] arr = hset.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println((String)arr[i]);
        }

        String[] arr2 = hset.toArray(new String[5]);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        hset.remove("html");
        System.out.println("hset = " + hset);
        System.out.println(Arrays.toString(arr));

        System.out.println("hset.size() = " + hset.size());
        hset.clear();
        System.out.println("hset.size() = " + hset.size());
        System.out.println("hset.isEmpty() = " + hset.isEmpty());

        
    }
}
