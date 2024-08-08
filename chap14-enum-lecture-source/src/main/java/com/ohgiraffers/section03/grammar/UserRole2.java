package com.ohgiraffers.section03.grammar;

public enum UserRole2 {
    GUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");

    private final String DECRIPTION;

    UserRole2(String decription) {
        this.DECRIPTION = decription;
    }

    public String getDescription(){
        return DECRIPTION;
    }
}
