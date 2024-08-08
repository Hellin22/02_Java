package com.ohgiraffers.chap02.section01.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 수업목표. 선택 정렬을 이해할 수 있다. */
/* 필기.
*   선택 정렬(Selection Sort)
*    대상 데이터에서 최대나 최소 데이터를 찾아 맨 앞(또는 맨 뒤)와 교환하는 방법이다.
*    배열의 모든 요소에 대해 반복한다.
*    시간 복잡도는 역시 O(n^2)이라 효율적이지는 않다.
* */
public class Application2 {
    /* 설명.
     *  문제 내용
     *   : N개의 정수가 주어졌을 때, 선택 정렬 알고리즘을 사용하여 내림차순으로 정렬하는 프로그램을 작성하시오.
     *  입력
     *   - 첫 번째 줄에 자연수 N(1 <= N <= 100)이 주어진다.
     *   - 두 번째 줄에 N개의 정수가 공백으로 구분되어 입력된다. 각 정수는 -10^9 이상, 10^9 이하이다.
     *  출력
     *    - 내림차순으로 정렬된 수열을 공백으로 구분하여 출력한다.
     *
     * 설명.
     *  예시 입력 1
     *    - 10
     *      32 7 34 39 40 41 22 31 23 25
     *  예시 출력 1
     *    - 41 40 39 34 32 31 25 23 22 7
     *
     * 설명.
     *  예시 입력 2
     *    - 6
     *      42 29 34 64 28 12
     *  예시 출력 2
     *    - 64 42 34 29 28 12
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

        solution(length, arr);
        for (int i : arr) {
            System.out.println(i + " ");
        }


    }

    public static void solution(int length, int[] arr) {
        for(int i = 0; i < length-1; i++){
            int maxIndex = i;
            for(int j = i + 1; j < length; j++){
                if(arr[i] < arr[j]){
                    maxIndex = j;
                    int tmp = arr[i];
                    arr[i] = arr[maxIndex];
                    arr[maxIndex] = tmp;
                    // 계속 바꾸는 알고리즘으로 짰는데 한번의 반복에서 한번만 교체하는게 일반적인 selection sort인듯
                    // 이건 알고리즘을 어떻게 구현하느야에따라 다름
                    // 그냥 반복문 1번에 1번의 swap이 일어나는데
                    // 최대 or 최소값을 왼쪽 or 오른쪽에 옮겨놓는다고 생각하기
                }
            }
        }
    }
}
