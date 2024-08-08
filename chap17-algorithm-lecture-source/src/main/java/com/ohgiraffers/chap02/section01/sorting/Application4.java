package com.ohgiraffers.chap02.section01.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 수업목표. 퀵 정렬을 이해할 수 있다. */
/* 필기.
 *   퀵 정렬(Quick Sort)
 *    기준값(pivot)을 선정해 해당 값보다 작은 데이터와 큰 데이터로 분류하는 것을 반복해서 정렬하는 것으로
 *    병합 알고리즘과 함께 실제 정렬 알고리즘으로 많이 활용되고 있다.
 *    시간 복잡도는 O(nlogn)이지만 최악의 경우는 O(n^2)이다.
 * */
public class Application4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

        solution(0, arr.length - 1, arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void solution(int low, int high, int[] arr) {
        if (low >= high) {
            return;
        }

        /* 설명. low와 high 포인터를 이동해서 low가 high를 지나칠 때까지 한 사이클 */
        int pivot = process(low, high, arr);
        solution(low, pivot, arr);
        solution(pivot + 1, high, arr);
    }

    /* 설명. low에 해당하는 포인터와 high에 해당하는 포인터를 최대한 움직여 pivot을 반환하는 메서드 */
    public static int process(int left, int right, int[] arr) {

        int lo = left - 1;
        int hi = right + 1;

        int pivot = arr[(left + right) / 2];
        while (true) {

            /* 설명. pivot 위치에 있는 값보다 작은 값을 기리키면 lo 포인터를 증가시킨다. */
            do {
                lo++;
            } while (arr[lo] < pivot); // 이게 피벗의 위치까지 가면 종료됨

            /* 설명. pivot 위치에 있는 값보다 크면서 lo 포인터의 위치보다 크거나 같은 위치이면 hi 포인터 감소 */
            do {
                hi--;
            } while (arr[hi] > pivot && hi >= lo);

            /* 설명. lo 포인터의 위치가 hi 포인터를 앞지르려고 하면 hi 포인터 위치를 반환한다. (분할 기준 반환) */
            if (lo >= hi) {
                return hi;
            }
            swap(arr, lo, hi);
        }
    }

    public static void swap(int[] arr, int lo, int hi) {
        int tmp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = tmp;
    }
}
