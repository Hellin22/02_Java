package com.ohgiraffers.section03.grammar;

public enum UserRole1 {
    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN;

    /* 설명. 단순한 메서드 하나 추가 해보기 */
    public String getNameToLowerCase(){
        return this.name().toLowerCase();
    }
}
