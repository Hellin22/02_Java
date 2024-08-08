package com.ohgiraffers.section04.testapp.service;

import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.repository.MemberRepository;

import java.util.ArrayList;

/* 설명. 트랜잭션 처리(성공 실패에 따른 commit/rollback) 및 회원 관련 비즈니스 로직 처리*/
public class MemberService {

    private final MemberRepository mr = new MemberRepository();

    public MemberService() {
    }

    public void findAllMembers() {
        ArrayList<Member> findMembers = mr.selectAllMembers();
        for (Member member : findMembers) {
            System.out.println(member);
        }
    }

    public void findMemberBy(int memNo) {
        Member selectedMember = mr.selectMemberBy(memNo);

        if (selectedMember != null) {
            System.out.println("조회된 회원은: " + selectedMember.getId() + " 아이디 회원");
        } else {
            System.out.println("그런사람 없음");
        }
    }

    public void registMember(Member newMember) {
        int lastMemberNo = mr.selectLastMemberNo();
        newMember.setMemNo(lastMemberNo + 1);
        int result = mr.insertMember(newMember);
//        System.out.println("성공실패 유무 확인: " + result);

        if(result == 1) {
            System.out.println(newMember.getId() + "님 회원가입 갑사함다");
            /* 설명. JDBC 이후에는 commit/rollback 처리도 할 예정 */
        }
    }

    public void removeMember(int removeMember) {
        int result = mr.deleteMember(removeMember);

        if(result == 1) {
            System.out.println("탈퇴 성공했습니다.");
            return;
        }
        System.out.println("회원번호 제대로 적으쇼");
    }

    public void updateMember(Member updateMember) {
        int result = mr.updateMember(updateMember);

        if(result == 1) {
            System.out.println("업데이트 완료했습니다");
        }else{
            System.out.println("회원번호가 없는데요?");
        }

    }
}
