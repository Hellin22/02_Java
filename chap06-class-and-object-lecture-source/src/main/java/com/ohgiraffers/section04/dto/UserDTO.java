package com.ohgiraffers.section04.dto;

import java.util.Date;

/* 필기.
*   자바빈(Java Bean)이란?
*    JSP에서 사용되는 표준 액션 태그로 접근할 수 있게 만든 자바 클래스형태이다.
*    자바코드를 모르는 웹 퍼블리셔들도 자바 코드를 사용할 수 있도록 태그 형식으로 지원하는 분법을
*    의미하는데, 그때 사용할 수 있도록 규칙을 지정해놓은 java 클래스를 자바빈(java bean)이라한다.
*    지금은 특정 목적, 프레임워크를 위해 클래스를 작성하는 규칙이라 보면 된다.
* */

/* 필기.
*   자바빈 작성 규칙
*   1. 자바빈은 특정 패키지에 속해 있어야 함.(default 패키지 사용 금지)
*   2. 필드의 접근 제어자는 private로 선언해야함 (캡슐화 적용)
*   3. 기본 생성자가 명시적으로 존재해야함.(매개변수 생성자는 선택사항)
*   4. 모든 필드에 접근 가능한 설정자(setter), 접근자(getter)가 public으로 작성되어야함.
*   5. 직렬화(Serializable 구현)를 고려해야함.(선택사항)
* */

public class UserDTO {

    /* 필기. 1. 필드(멤버변수) */
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /* 필기. 2. 생성자(기본생성자 필수로 명시적 작성) */
    public UserDTO() {

    }

    public UserDTO(String id, String pwd, String name, Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    /* 필기. 3. 설정자(setter), 접근자(getter)*/
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    /* 설명. 4. 모든 멤버 변수를 하나의 String 문자열로 반환하는 toString()*/
    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
