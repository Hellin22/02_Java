package com.ohgiraffers.section03.stringbuilder;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. StringBuilder의 자주 사용되는 메서드의 용법 및 원리를 이해할 수 있다. */
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());          // 16byte의 용량

        for (int i = 0; i < 50; i++) {
            sb.append(i);
            System.out.println("sb: " + sb);
            System.out.println("capacity: " + sb.capacity());
            System.out.println("identityHashCode: " + System.identityHashCode(sb));
        }

        /* 설명. StringBuilder는 가변객체(mutable object)로써 내부적으로 용얄이 증가하는 방식을 취한다. */
//        StringBuilder sb2 = new StringBuilder("javamariaDB");
        StringBuffer sb2 = new StringBuffer("javamariaDB");
        System.out.println(sb2.capacity());         // 문자열 크기(11byte) + 16byte (초기값)

        /* 필기.
        *   delete():
        *   deleteCharAt():
        * */
        System.out.println("delete(): " + sb2.delete(2, 5));
        System.out.println("deleteCharAt(): " + sb2.deleteCharAt(0));
        System.out.println(sb2);

        /* 필기.
        *   insert(): 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스 위치에 추가한다.
        * */
        System.out.println("insert(): " + sb2.insert(1, "vao"));
        System.out.println("insert(): " + sb2.insert(0, "j"));
        System.out.println("insert(): " + sb2.insert(sb2.length(), "jdbc"));
        System.out.println(sb2);

        /* 필기.
        *   reverse(): 문자열 인덱스 순번을 역순으로 재배열한다.
        * */
        System.out.println("reverse(): " + sb2.reverse());



    }
}
