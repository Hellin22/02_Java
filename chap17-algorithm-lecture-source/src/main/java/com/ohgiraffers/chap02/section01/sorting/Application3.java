package com.ohgiraffers.chap02.section01.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 수업목표. 삽입 정렬을 이해할 수 있다. */
/* 필기.
*   삽입 정렬(Insertion Sort)
*    이미 정렬된 데이터 범위에 정렬되지 않은 데이터를 적절한 위치에 삽입시켜 정렬하는 방식
*    시간복잡도는 O(n^2)이라 효율적이지는 않다.
*    해당 위치에 있는 값을 앞의 어떤 위치에 들어갈지 훑어보며 밀어주다 원하는 위치에 넣음.
* */
/* 설명. 삽입 정렬을 생각해보자.
*   2번째 idx를 1번째 idx와 비교하고 정렬 -> 1, 2 idx는 정렬됨
*   3번째 idx를 앞에랑 비교 -> 여기서 중요한게 3번째 원소는 1, 2번째 원소와 모두 비교해야함.(최악의 경우)
*   하지만 만약 3번째 원소가 가장 작은 원소 -> 1번째 원소와 비교한 후에 바로 집어넣기 가능 -> 최선의 경우 O(n)
*   하지만 최선의 경우는 내림차순으로 정렬되어 있는 경우이므로 이미 정렬된 상태라고 생각할 수 있어 별로 좋지 않다.(이런 상황이 별로 없음)
* */
public class Application3 {
    /* 설명.
     *  문제 내용
     *   : N개의 정수가 주어졌을 때, 삽입 정렬 알고리즘을 사용하여 오름차순으로 정렬하는 프로그램을 작성하시오.
     *  입력
     *   - 첫 번째 줄에 자연수 N(1 <= N <= 100)이 주어진다.
     *   - 두 번째 줄에 N개의 정수가 공백으로 구분되어 입력된다. 각 정수는 -10^9 이상, 10^9 이하이다.
     *  출력
     *    - 오름차순으로 정렬된 수열을 공백으로 구분하여 출력한다.
     *
     * 설명.
     *  예시 입력 1
     *    - 8
     *      33 39 20 4 16 24 19 28
     *  예시 출력 1
     *    - 4 16 19 20 24 28 33 39
     *
     * 설명.
     *  예시 입력 2
     *    - 6
     *      14 38 5 26 17 19
     *  예시 출력 2
     *    - 5 14 17 19 26 38
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
            System.out.print(i);
        }
    }

    public static void solution(int length, int[] arr){
        for(int i = 1; i < length; i++){
            int tmp = arr[i];
            int j;
            for(j = i-1; j >= 0; j--){
                if(arr[j] > tmp) arr[j+1] = arr[j];     // 뒤로 밀기
                else break;
            }

            arr[j+1] = tmp; // j--를 통해 작아지므로 j+1에다가 넣어준다.
        }
    }
}
