package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;

import java.io.*;

public class Application4 {
    public static void main(String[] args) {

        // 6번
        MemberDTO[] memArr = new MemberDTO[100];
        memArr[0] = new MemberDTO("user01", "pass01", "홍길동", "hong123@gmail.com", 25, '남');
        memArr[1] = new MemberDTO("user02", "pass02", "김김김", "hdksdud@gmail.com", 15, '여');
        memArr[2] = new MemberDTO("user03", "pass03", "백백백", "gpffhdn@gmail.com", 235, '남');
        memArr[3] = new MemberDTO("user04", "pass04", "신신신", "hahfewohoi@gmail.com", 11, '여');


        File ObjFile =  new File("src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt");
        ObjectOutputStream objOut = null;

        try {
                objOut = new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt", true)));


            for (int i = 0; i < memArr.length; i++) {
                if (memArr[i] == null) break;
                objOut.writeObject(memArr[i]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (objOut != null) objOut.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



        //////// 7번 시작
        MemberDTO[] newMemArr = new MemberDTO[memArr.length];
        ObjectInputStream objIn = null;
        try {
            objIn = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt")));

            int i = 0;
            while(true){
                newMemArr[i] = (MemberDTO) objIn.readObject(); // 다운캐스팅 적용
                i++;
            }

        } catch (EOFException e) {
            System.out.println("객체 단위 파일 입력 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (objIn != null) objIn.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        for (MemberDTO memberDTO : newMemArr) {
            if(memberDTO == null) break;
            System.out.println(memberDTO);
        }

    }
}
