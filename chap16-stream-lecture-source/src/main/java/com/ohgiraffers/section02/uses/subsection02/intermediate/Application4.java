package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. 스트림의 중계 연산 중 하나인 sorted에 대해 이해하고 사용할 수 있다. */
        List<Integer> integerList = IntStream.of(5, 10, 99, 124, 2, 1)
                                            .boxed()
                                            //.sorted()
                                            //.sorted(Comparator.reverseOrder())
                                            .sorted(new DescInteger())
                                            .collect(Collectors.toList());

        System.out.println("정렬된 Integer List: " + integerList);
    }
}
