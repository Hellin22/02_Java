package com.ohgiraffers.section02.set.run;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. TreeSet에 대해 이해하고 활용할 수 있다. */
        /* 설명. Tree 구조를 활용해 중복제거 + 정렬 해줌. */
        Set<String> tSet = new TreeSet<>();
        Set<String> ttSet = new TreeSet<>(Comparator.reverseOrder());
        tSet.add("ramen");
        tSet.add("pork");
        tSet.add("kimchi");
        tSet.add("friedEgg");
        tSet.add("soup");

        System.out.println("tSet = " + tSet);

        Set<Integer> lotto = new TreeSet<>();

        /* 설명. 1부터 45까지 난수를 중복되지 않게 발생시키고 정렬까지 적용 */
        while(lotto.size() < 6){
            lotto.add((int)(Math.random()*45) + 1);
        }
        System.out.println("lotto = " + lotto);

    }
}
