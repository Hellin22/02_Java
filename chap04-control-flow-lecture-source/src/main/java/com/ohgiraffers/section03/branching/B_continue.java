package com.ohgiraffers.section03.branching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class B_continue {
    public void testSimpleContinueStatement(){

        /* 설명. 1부터 100까지 4와 5의 공배수만 출력*/
        for(int i = 1; i <= 100; i++){
//            if(i % 4 == 0 && i % 5 == 0){
//                System.out.println(i + "는 4와 5의 공배수");
//            }

            /* 설명. continue를 활용한 구문으로 변환  */
            if(!(i % 4 == 0 && i % 5 == 0)){
                continue;               // continue 이후 반복문의 구간을 건너뛴다.
            }
            System.out.println(i + "는 4와 5의 공배수");
        }
    }


    public void a(){
        Integer[] intArr = {8,7,6,5,4};
        Arrays.sort(intArr, Collections.reverseOrder()); // 내림차순 정렬
        for (int i : intArr)
            System.out.print(i + " ");
        // 8 7 6 5 4
    }
}
