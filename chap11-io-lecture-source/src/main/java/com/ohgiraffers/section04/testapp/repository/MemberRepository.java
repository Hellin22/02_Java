package com.ohgiraffers.section04.testapp.repository;

import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.stream.MyObjectOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/* 역할 설명. 데이터와 입출력을(CRUD) 위해 만들어지며 성공 실패 여부를 반환*/
public class MemberRepository {

    private ArrayList<Member> memberList = new ArrayList<>();

    /* 설명.
     *   최초에 생성될 객체의 생성자 (프로그램 켜자마자 실행해야하는 일)
     *   1. 초기 회원 세명을 넣어둘 예정(스트림을 활용한 객체 출력)
     *   2. 파일로부터 회원 정보를 가져온다.(스트림을 활용한 객체 입력)
     *   3. ArrayList를 활용해 가져온 회원 정보를 저장
     * */
    public MemberRepository() {
        // 켜자마자 파일에서 값을 가져와야함.
        File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat");

        /* 설명. main을 실행할 때마다 덮어씌우는 문제를 방지하고자 파일이 없을 때만 초기 세팅이 되도록 조건문 작성 1*/
        if (!file.exists()) {
            ArrayList<Member> defaultMembers = new ArrayList<>();       // 초기 회원 세명만 담는 용도의 ArrayList(지역변수)
            // 쉽게 말해서 추가할 멤버 3명을 defaultMembers에 담아놓고 load한 후에 거기에 추가하는 의미인듯?
            defaultMembers.add(new Member(1, "user01", "pass01", 20, new String[]{"발레", "수영"}, BloodType.A));
            defaultMembers.add(new Member(2, "user02", "pass02", 10, new String[]{"게임", "영화시청"}, BloodType.B));
            defaultMembers.add(new Member(3, "user03", "pass03", 15, new String[]{"음악감상", "독서", "명상"}, BloodType.O));

            /* 설명. 초기 멤버 3명을 파일로 객체 출력하는 코드 작성 */
            saveMembers(file, defaultMembers);
        }

        /* 설명. 파일로부터 회원 객체들을 입력받아 memberList에 넣기 */
        loadMember(file);

        /* 설명. loadMember()메서드를 통해 잘 불러와졌는지 확인 -> 중간확인*/
//        for(Member member : memberList) {
//            System.out.println("member = " + member);
//        }
    }


    // 파일에서 회원정보를 불러오는 코드 (파일 -> 자바 app)
    private void loadMember(File file) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(file)));

            while (true) {
                memberList.add((Member) ois.readObject());
            }

        } catch (EOFException e) {
            System.out.println("회원 정보 모두 로딩됨...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // 최초에 3명의 회원을 파일에 추가하는 코드. 제일 먼저 실행됨. (최초 1번 실행되고 실행x) -> 이거도 if문 써서 조절할거임.
    private static void saveMembers(File file, ArrayList<Member> members) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(file)));

            /* 설명. 초기 회원 3명을 각각 객체 출력 내보내기를 함 */
            for (Member member : members) {
                oos.writeObject(member);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ArrayList<Member> selectAllMembers() {
        return memberList;
    }

    public Member selectMemberBy(int memNo) {
        Iterator<Member> iterMem = memberList.iterator();
        while (iterMem.hasNext()) {
            Member member = iterMem.next();
            if (member.getMemNo() == memNo) return member;
        }
        return null;
    }

    public int insertMember(Member newMember) {

        /* 설명. 객체 파일 출력으로 insert 개념을 진행할 때는 기존 회원에 이어서 출력이 발생해야함 */
        // -> append를 true롤 해줘야 하고 헤더를 붙이면 안되므로 header 관련 메서드를 오버라이드 해야함.
        // -> MyObjectOupput extends ObjectOutputStream -> 생성자 오버라이드(예외때문)
        MyObjectOutput moo = null;
        int result = 0;
        try {
            moo = new MyObjectOutput(
                    new BufferedOutputStream(
                            new FileOutputStream("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat"
                                    , true)));

            /* 설명. 파일로 새로운 회원 객체 추가 출력하기(기존 회원에 추가) */
            moo.writeObject(newMember);

            /* 설명. 파일 출력이 성공하면 회원을 관리하는 컬렉션에도 추가(최신화) */
            memberList.add(newMember);

            /* 설명. 객체 한개 insert 성공을 의미하는 int값 */
            result = 1;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (moo != null) moo.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return result;
    }

    /* 설명. insert를 하기 위해 회원 번호를 발생 시키는데 사용되는 마지막 회원의 번호 추출 기능 메서드 */
    public int selectLastMemberNo() {

        /* 설명. 1. 마지막 회원을 조회해서 그 회원의 회원번호를 확인 */
        Member lastMember = memberList.get(memberList.size() - 1);
        return lastMember.getMemNo();
//        int memNo = memberList.get(memberList.size()-1).getMemNo();

        /* 설명. 2. 컬렉션의 크기가 곧 회원 번호이므로 마지막 회원의 번호는 컬렉션의 크기(항상 만족은 x) */
//        return memberList.size();
    }

    // soft delete 진행
    public int deleteMember(int removeMember) {

        /* 설명.
        *   현재는 우리가 마지막 회원 번호 추출을 위해 컬렉션의 size()를 활용하고 있다.
        *   (그래서 hard delete(실제 회원 객체를 제거)를 할 수 없고 soft delete(회원 중에 탈퇴와 관련된 속성 수정)을 진행해야 한다.
        *
        * 설명.
        *   hard delete를 하게 된다면 memberList에서 회원 한명을 remove() 메서드를 활용하여 삭제하고
        *   파일 객체 출력을 통해 파일에 컬렉션에 있는 회원들을 다시 덮어씌워야 한다. (ObjectOutputStream을 활용해서 덮어씌우기)
        * */

        /* 설명. soft delete 시*/
//        int result = 0;
//        try{
//            for (Member member : memberList) {
//                if(member.getMemNo() == removeMember){
//                    member.setId(null);
//                    result = 1;
//                    break;
//                }
//            }
//        }catch (Exception e){
//            System.out.println("탈퇴 불가능합니다 ㅋㅋ");
//        }
//
//        return result;

        /* 설명. hard delete 시 */
        int result = 0;
        for (int i = 0; i < memberList.size(); i++) {
            if(memberList.get(i).getMemNo() == removeMember){
                memberList.remove(i);

                File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat");
                saveMembers(file, memberList);

                /* 설명. 컬렉션의 모든 내용을 파일로 출력(덮어씌우기) */
                result = 1;
            }
        }
        return result;
    }

    public int updateMember(Member updateMember) {

        int result = 0;
        for(int i = 0; i < memberList.size(); i++){
            if(memberList.get(i).getMemNo() == updateMember.getMemNo()){
                memberList.set(i, updateMember);

                File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat");
                saveMembers(file, memberList);

                result = 1;
                break;
            }
        }

        return result;
    }
}
