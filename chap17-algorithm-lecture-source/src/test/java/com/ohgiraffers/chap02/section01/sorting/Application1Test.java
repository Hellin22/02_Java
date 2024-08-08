package com.ohgiraffers.chap02.section01.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Application1Test {
    private static int input1, input2;
    private static int[] act1, act2;
    private static int[] exp1, exp2;

    @BeforeAll // given
    public static void set(){
        /* 설명. 예시 1 */
        input1 = 7;
        act1 = new int[]{34, 23, 5, 24, 1, 9, 12};
        exp1 = new int[]{1, 5, 9, 12, 23, 24, 34};

        /* 설명. 예시 2 */
        input2 = 6;
        act2 = new int[]{40, 47, 38, 8, 33, 35};
        exp2 = new int[]{8, 33, 35, 38, 40, 47};
    }

    public static Stream<Arguments> provideAscendingSource(){
        return Stream.of(
                Arguments.of(input1, act1, exp1),
                Arguments.of(input2, act2, exp2)
        );
    }

    @DisplayName("버블 정렬")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest      // 파라미터가 넘어오는 테스트코드 작성하기 위한것. @Test는 파라미터 x
    @MethodSource("provideAscendingSource")     // 위 코드에서 선언한 스트림의 한줄 Arguments가 하나씩 넘어온다
    public void bubleSortTests(int length, int[] actual, int[] expected){
        Application1.solution(length, actual);  // when
        Assertions.assertArrayEquals(expected, actual); // then
    }
    // given
    // when
    // then

}