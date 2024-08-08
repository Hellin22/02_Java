package com.ohgiraffers;

import java.util.Scanner;

public class ds {
    public static void main(String[] args) {
        long a, b, v;
        Scanner sc = new Scanner(System.in);

        a=sc.nextLong();
        b=sc.nextLong();
        v=sc.nextLong();

        long ccnt = (v-a)/(a-b);

        System.out.println(ccnt+1);
    }
}
