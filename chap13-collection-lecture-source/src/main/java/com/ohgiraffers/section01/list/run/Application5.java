package com.ohgiraffers.section01.list.run;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {

        /* 수업목표. Queue에 대해 이해하고 활용할 수 있다. */
        /* 필기.
        *   Queue란?
        *    선형 메모리 공간에 데이터를 저장하여 순서를 유지하기 위한 선입선출(FIFO) 방식의 자료구조이다.
        *    대부분 LinkedList를 많이 사용한다.
        * */
//        Queue que = new Queue();
//        Queue<String> que = new LinkedList<>();
//        LinkedList<String> que = new LinkedList<>();      // LinkedList는 queue 중에서도 deque에 해당되어
                                                            // offerFirst()나 offerLast() 같은 메서드도 제공된다.
        /* 설명. PriorityQueue를 활용하면 선입선출 + 정렬의 개념을 가져갈 수 있다. */
//        PriorityQueue<String> que = new PriorityQueue<>();        // String의 기준대로 문자열 오름차순 -> 예외 있을 수 있음.
        PriorityQueue<String> que = new PriorityQueue<>(Comparator.reverseOrder()); // 반대인 내림차순

        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);

        System.out.println("que.peek() = " + que.peek());
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que = " + que);
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que = " + que);
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que = " + que);
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que = " + que);
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que = " + que);

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(7);
        queue.add(2);
        System.out.println(queue);  // 내부 배열의 상태를 출력

    }
}
