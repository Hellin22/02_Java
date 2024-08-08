package com.ohgiraffers.section08.uses;

/* 설명. 회원가입 잘 시키는 클래스(회원가입 페이지로 바뀌는 녀석) */
public class MemberRegister {

    public void regist(Member[] members) {
        /* 설명. 회원가입 하겠다는 대상들을 한명한명 저장했다고 보자. */
        System.out.println("회원을 등록합니다.");

        for (int i = 0; i < members.length; i++) {
            System.out.println(members[i].getName() + "님을 회원 등록에 성공했습니다.");
        }

        /* 설명. db 개념에 회원을 insert */
        if(MemberRepository.store(members)){
            System.out.println("총 " + members.length + "명의 회원 등록에 성공");
        }
    }
}
