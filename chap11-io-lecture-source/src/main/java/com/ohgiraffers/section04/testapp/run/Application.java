package com.ohgiraffers.section04.testapp.run;

import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.service.MemberService;

import java.util.Scanner;

public class Application {

    private static final MemberService ms = new MemberService();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("===== 회원 관리 프로그램 =====");
            System.out.println("1. 모든 회원 정보 보기");
            System.out.println("2. 회원 찾기");
            System.out.println("3. 회원 가입");
            System.out.println("4. 회원 탈퇴");
            System.out.println("5. 회원 수정");
            System.out.println("9. 회원 프로그램 종료");
            System.out.print("메뉴를 선택해 주세요: ");
            int input = sc.nextInt();

            switch(input){
                case 1: ms.findAllMembers(); break;
                case 2: ms.findMemberBy(chooseMemNo()); break;
                case 3: ms.registMember(signUp()); break;
                case 4: ms.removeMember(chooseMemNo()); break;
                case 5:
                    ms.updateMember(updateMember()); break;
                case 9:
                    System.out.println("회원관리 프로그램 종료할게요");
                    return;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
            }
        }
    }

    private static Member signUp() {
        Member newMember = new Member();

        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요: ");
        String id = sc.nextLine();

        System.out.println("패스워드를 입력하세요: ");
        String pwd = sc.nextLine();

        System.out.println("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.println("입력할 취미 개수를 입력하세요(숫자로 1 이상): ");
        int length = sc.nextInt();
        sc.nextLine();          // 버퍼의 개행문자 처리용

        String[] hobbies = new String[length];

        for (int i = 0; i < hobbies.length; i++) {
            System.out.println((i+1) + "번째 취미를 입력하세요: ");
            String input = sc.nextLine();
            hobbies[i] = input;
        }

        System.out.println("혈액형을 입력하세요(A, AB, B, O): ");
        String bloodType = sc.nextLine().toUpperCase();
        BloodType bt = null;
        switch (bloodType){
            case "A": bt = BloodType.A; break;
            case "AB": bt = BloodType.AB; break;
            case "B": bt = BloodType.B; break;
            case "O": bt = BloodType.O; break;
        }

        /* 필기.
        *   회원으로부터 회원가입을 위한 정보를 입력 받아 Member 타입 객체 하나로 가공처리할 방법이 2가지 있음.
        *   1. 생성자를 통해서 객체 생성시에 초기화 하기(매개변수 생성자)
        *   -> 한줄코딩 가능 but, 따로 생성자 추가필요, 생성자 매개변수가 다소 늘어날 수 있음(리팩토링 징조)
        *   2. setter 방식
        *   -> 초기화할 개수 수정 용이(생성자는 새로운 생성자 자체를 만들어야함, 가독성 좋음. but, 코드줄이 길어짐)
        * */
        newMember = new Member(id, pwd, age, hobbies);

        newMember.setBloodType(bt);

        return newMember;
    }

    /* 설명. 회원 ID를 입력 받아 반환하는 메서드*/
    private static int chooseMemNo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("회원 번호를 입력하세요: ");
        int memNo = sc.nextInt();
        return memNo;
        // return sc.nextInt();
    }

    private static Member updateMember(){
        Scanner sc = new Scanner(System.in);

        System.out.println("본인의 회원번호를 입력하세요: ");
        int memNo = sc.nextInt();

        sc.nextLine();

        System.out.println("수정할 아이디를 입력하세요: ");
        String id = sc.nextLine();

        System.out.println("수정할 패스워드를 입력하세요: ");
        String pwd = sc.nextLine();

        System.out.println("수정할 나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.println("수정할 입력할 취미 개수를 입력하세요(숫자로 1 이상): ");
        int length = sc.nextInt();
        sc.nextLine();          // 버퍼의 개행문자 처리용

        String[] hobbies = new String[length];

        for (int i = 0; i < hobbies.length; i++) {
            System.out.println("수정할 " + (i+1) + "번째 취미를 입력하세요: ");
            String input = sc.nextLine();
            hobbies[i] = input;
        }

        System.out.println("수정할 혈액형을 입력하세요(A, AB, B, O): ");
        String bloodType = sc.nextLine().toUpperCase();
        BloodType bt = null;
        switch (bloodType){
            case "A": bt = BloodType.A; break;
            case "AB": bt = BloodType.AB; break;
            case "B": bt = BloodType.B; break;
            case "O": bt = BloodType.O; break;
        }
        return new Member(memNo, id, pwd, age, hobbies, bt);
    }

}
