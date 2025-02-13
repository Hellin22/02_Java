package com.ohgiraffers.section01.array;

public class Application5 {
    public static void main(String[] args) {

        /* 수업목표. 배열을 사용하는 예시를 통해 카드 게임을 작성해보자. */
        String[] shape = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        int randomShapeIndex = (int) (Math.random() * shape.length); // 0 ~ 3
        int randomCardNumberIndex = (int) (Math.random() * cardNumber.length); // 0 ~ 12

        System.out.println("당신이 뽑은 카드는 " + shape[randomShapeIndex] + " " + cardNumber[randomCardNumberIndex]);
    }
}
