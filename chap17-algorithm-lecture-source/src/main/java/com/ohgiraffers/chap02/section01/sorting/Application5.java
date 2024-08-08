package com.ohgiraffers.chap02.section01.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 수업목표. 병합 정렬을 이해할 수 있다. */
/* 설명.
*   병합 정렬(Merge Sort)
*    데이터를 분할하고 분할한 집합을 정렬해서 합치는 방식(분할 정복 방식)으로 정렬한다.
*    시간 복잡도는 O(logn)이다.
* */
public class Application5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String strs[] = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

        solution(0, arr.length-1, arr);

        System.out.println(Arrays.toString(arr));
    }



    public static void solution(int low, int high, int[] arr){

        if(low - high == 0){
            return;
        }
        int mid = (low + high)/2;

        solution(low, mid, arr);
        solution(mid + 1, high, arr);

        /* 설명. 정렬 전 tmp에 배열 복사 */
        int[] tmp = arr.clone();

        /* 설명. 분할 정복 방식으로 작은 값부터 값을 쌓음 */
        int k = low; // tmp에 대한 idx
        int index1 = low;
        int index2 = mid + 1;

        /* 설명. 두 인덱스가 가리키는 값들을 비교하고 하나라도 분할 구역의 끝을 만나면 멈추는 반복문 실행 */
        while(index1 <= mid && index2 <= high){
            if(tmp[index1] < tmp[index2]){      // 내림차순을 위한 조건식`
                arr[k] = tmp[index2];
                k++;
                index2++;
            }else{
                arr[k] = tmp[index1];
                k++;
                index1++;
            }
        }

        /* 설명. 좌측 인덱스 마저 옮기기 */
        while(index1 <= mid){
            arr[k] = tmp[index1];
            k++;
            index1++;
        }

        /* 설명. 우측 인덱스 마저 옮기기 */
        while(index2 <= high){
            arr[k] = tmp[index2];
            k++;
            index2++;
        }

    }

}
