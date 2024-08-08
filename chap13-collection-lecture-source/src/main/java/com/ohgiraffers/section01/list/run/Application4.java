package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. Stack에 대해 이해하고 사용할 수 있다. */
        /* 필기.
        *   Stack이란?
        *    후입선출(LIFO) OR 선입후출(FILO)의 자료구조로 push(), pop(), peek() 등의 메서드를 활용하여 자료처리 가능
        *
        * */

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search(2));

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
    }
}
