package com.ohgiraffers.chap02.section01.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

/* 수업목표. 버블정렬을 이해할 수 있다. */
/* 필기.
 *   정렬 알고리즘
 *    데이터를 특정 순서대로 배열하는데 사용한다. (일반적으로는 배열의 정렬을 뜻함)
 *
 * 필기.
 *   버블 정렬(Bubble Sort)
 *    두 인접한 데이터의 크기를 비교해 정렬하는 방법
 *    버블의 모든 요소에 대해 반복하면서, 각 반복마다 가장 큰(작은) 요소가 배열의 끝으로
 *    "버블링(이동)" 된다.
 *    시간 복잡도는 O(n^2)이라 효율적이지는 않다.
 * */
public class Application1 {
    /* 설명.
     *  문제 내용
     *   : N개의 정수가 주어졌을 때, 버블 정렬 알고리즘을 사용하여 오름차순으로 정렬하는 프로그램을 작성하시오.
     *  입력
     *   - 첫 번째 줄에 자연수 N(1 <= N <= 100)이 주어진다.
     *   - 두 번째 줄에 N개의 정수가 공백으로 구분되어 입력된다. 각 정수는 -10^9 이상, 10^9 이하이다.
     *  출력
     *   - 오름차순으로 정렬된 수열을 공백으로 구분하여 출력한다.
     *
     *  설명.
     *   예시 입력 1
     *     - 7
     *       34 23 5 24 1 9 12
     *   예시 출력 1
     *     - 1 5 9 12 23 24 34
     *  설명.
     *   예시 입력 2
     *     - 6
     *       40 47 38 8 33 35
     *   예시 출력 2
     *     - 8 33 35 38 40 47
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* 설명. mapToInt는 Stream을 IntStream으로 바꿔주기 위한 메서드 */
//        IntStream intStream = Arrays.stream(br.readLine().split(" ")).mapToInt(x->Integer.parseInt(x));
//        int[]arr = intStream.toArray();

        int length = Integer.parseInt(br.readLine());
        int[] arr = new int[length];
        String[] strs = br.readLine().split(" ");
        for(int i = 0; i < length; i++){
            arr[i] = Integer.parseInt(strs[i]);
        }

        /* 설명. 알고리즘 실행 (solution) */
        solution(length, arr);          // call by reference: 같은 주소값의 배열을 다루게 된다.

        /* 설명. 단순 메서드 참조가 아닌 정도에선 굳이 스트림 문법을 활용할 필요까진 없다. */
//        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /* 설명. 넘어온 데이터를 가지고 버블 정렬 알고리즘 작성 시작 */
    public static void solution(int length, int[] arr) {
        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length-1 - i; j++) {    // j < length - 1로 했는데 효율적으로 하려면 length -1 -i가 맞는거같다.
                if(arr[j] > arr[j+1]){
                    /* 설명. j번째와 그 다음인 (j+1)번째 위치를 서로 바꾼다.(swap) */
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }

    }
}
