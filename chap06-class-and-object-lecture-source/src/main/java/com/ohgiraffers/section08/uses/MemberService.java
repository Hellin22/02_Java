package com.ohgiraffers.section08.uses;

import java.util.Arrays;

public class MemberService {

    /* 설명. 회원 가입을 5명 진행하고 저장하기 위해 저장용 객체(Register)에게 호출 */
    public void signUpMember() {
        Member[] members = new Member[5];
        members[0] = new Member(1, "user01", "pass01", "홍길동", 2012, '남');
        members[1] = new Member(1, "user02", "pass02", "우간순", 210, '남');
        members[2] = new Member(1, "user03", "pass03", "홍거고", 420, '여');
        members[3] = new Member(1, "user04", "pass04", "나나나", 260, '남');
        members[4] = new Member(1, "user05", "pass05", "디디디", 280, '여');

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);
    }

    public void showAllMembers() {

        MemberFinder finder = new MemberFinder();
        System.out.println("===== 가입된 회원 목록 =====");
        System.out.println(Arrays.toString(finder.findAllMembers()));
    }
}
