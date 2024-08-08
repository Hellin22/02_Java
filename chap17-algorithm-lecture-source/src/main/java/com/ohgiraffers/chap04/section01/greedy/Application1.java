package com.ohgiraffers.chap04.section01.greedy;

public class Application1 {
    public static int solution(int n){

        /* 설명. 3킬로, 5킬로 봉지로 가져갈 수 있는 최소 봉지 수 */
        int count = 0;

        while(true){
            if(n%5 == 0){           // 처음부터 5킬로 또는 3킬로씩 덜어내며 5킬로 봉지로 나눌 수 있는 경우
                return n / 5 + count;
            }else if(n < 0){        // 3킬로 또는 5킬로 봉지로 해결이 안되는 경우
                return -1;
            }else if(n == 0){       // 3킬로 봉지로 해결되는 경우
                return count;
            }

            /* 설명. 어쩔 수 없이 3킬로 1봉지만큼 무게 덜어낸다.*/
            n-=3;
            count++;
        }
    }

}
