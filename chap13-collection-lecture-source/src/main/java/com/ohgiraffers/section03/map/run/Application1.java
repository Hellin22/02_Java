package com.ohgiraffers.section03.map.run;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Map의 자료구조에 대해 이해하고 HashMap을 이용할 수 있다. */
        Map<Object, Object> hMap = new HashMap<>();
        hMap.put("one", new Date());
        hMap.put(12, "red");
        hMap.put(33, 123);

        System.out.println("키가 \"one\"인 value 값은: " + hMap.get("one"));
        System.out.println("Map의 toString(): " + hMap.toString());

        hMap.put(new BookDTO(1, "AE", "aeFAWE", 1532), "title만 같으면 ok다");
        System.out.println(hMap);
        System.out.println(hMap.get(new BookDTO(1, "AE", "aeFAWE", 1532)));

        /* 설명. 키 값은 중복되면 안되지만 중복될 경우 나중의 키와 밸류가 기존의 값을 덮어 씌운다. */
        hMap.put(12, "purple banana");
        System.out.println(hMap);

        /* 설명. 밸류 값은 중복되어도 상관 없이 추가된다. */
        hMap.put(34, 123);
        System.out.println("hMap = " + hMap);

        System.out.println("hMap의 엔트리 수 = " + hMap.size());

        System.out.println("34번 키와 관련된 entry 삭제: " + hMap.remove(34));
        System.out.println("삭제후 hMap의 엔트리 수 = " + hMap.size());

        /* 설명. Map을 활용해보자. (반복해서) */
        Map<String, String> hMap2 = new HashMap<>();
        hMap2.put("one", "java 17");
        hMap2.put("two", "mariaDB V10");
        hMap2.put("three", "servlet/jsp");
        hMap2.put("four", "sprintboot 3.0");
        hMap2.put("five", "vue.js");

        /* 목차. 1. keySet()을 활용한 iterator 반복하기 (feat.key 값만 set으로 변환하자.) */
        Set<String> keys = hMap2.keySet();

        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            System.out.println("key: " + key + ", value: " + hMap2.get(key));
        }

        /* 목차. 2. entrySet()을 활용한 iterator 반복하기 (feat. key + value set으로 변환) */
        Set<Map.Entry<String, String>> set = hMap2.entrySet();
        Iterator<Map.Entry<String, String>> iterEntry = set.iterator();
        while(iterEntry.hasNext()){
            Map.Entry<String, String> entry = iterEntry.next();
            System.out.println("key: " + entry.getKey() + "value: " + entry.getValue());
        }


        Integer a = 1;
        System.out.println(System.identityHashCode(a));
        int b = 1;
        int c = a;
        Integer d = a;
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));

        String aa = "awef";
        String bb = aa;
        String cc = "awef";
        System.out.println(System.identityHashCode(aa + "Aew"));
        System.out.println(System.identityHashCode(bb));
        System.out.println(System.identityHashCode(cc));

    }
}
