package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Application2 {
    static LinkedList<BookDTO> bookList = new LinkedList<>();

    public static void main(String[] args) {
        int a = BookDTO.a;
        /* 수업목표. ArrayList에서 관리되는 자료형의 정렬 기준을 이용할 수 있다. */
        /* 목차. 1. Comparable 인터페이스 구현 방법 활용 */ // 2가지가 있음.
        bookList.add(new BookDTO(1, "홍길동전", "허균", 501241200));
        bookList.add(new BookDTO(2, "김전전", "허허", 150000));
        bookList.add(new BookDTO(3, "백전전전", "허허허", 250000));
        bookList.add(new BookDTO(4, "이전전전전", "허허허허", 350000));
        bookList.add(new BookDTO(5, "신전전전전전", "허허허허허", 450000));

        /* 설명. Collections.sort를 활용한 정렬(Comparable 방식 또는 Comparator 방식) */
//        Collections.sort(bookList);                           // Comparable 방식
        Collections.sort(bookList, new AscendingPrice());       // Comparator 방식
        bookList.sort(new AscendingPrice());
        bookList.sort(Comparator.naturalOrder());

        System.out.println(123);
        Iterator<BookDTO> it1 = bookList.descendingIterator();

        System.out.println(123);

        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        Queue<Integer> q = new ArrayBlockingQueue<>(3);
        q.add(1);
        q.add(2);
        q.add(3);
        Iterator<Integer> it2 = q.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println(q.offer(4));
    }
}
