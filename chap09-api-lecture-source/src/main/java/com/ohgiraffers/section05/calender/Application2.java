package com.ohgiraffers.section05.calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. java.util.Calendar 클래스 사용법을 이해하고 사용할 수 있다. */
        /* 필기.
         *   Date형 대비 개선점
         *   1. timezone과 관련된 기능 추가
         *   2. 윤년 관련 기능이 내부적으로 추가
         *   3. 날짜 및 시간 필드 개념을 추가해 불필요한 메서드명을 줄였다.
         * */

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Calendar calendar2 = new GregorianCalendar();
        System.out.println(calendar2.get(Calendar.YEAR));           // 날짜 및 시간의 개념을 필드로 계산

        int year = 1987;
        int month = 8;      // 9월
        int dayOfMonth = 15;
        int hour = 17;
        int min = 30;
        int second = 0;

        Calendar birthDay = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);
        System.out.println(birthDay);

        System.out.println("태어난 해: " + birthDay.get(1));
        System.out.println("태어난 달: " + (birthDay.get(2) + 1));
        System.out.println("태어난 일: " + birthDay.get(Calendar.DAY_OF_MONTH));
        System.out.println("태어난 시: " + birthDay.get(10));
        System.out.println("태어난 분: " + birthDay.get(12));
        System.out.println("태어난 초: " + birthDay.get(Calendar.SECOND));

        System.out.println("AM/PM: " + birthDay.get(Calendar.AM_PM));           // 0은 오전, 1이 오후
        System.out.println("hourOfDay: " + birthDay.get(Calendar.HOUR_OF_DAY)); // 24시간 체계
        System.out.println("hour: " + birthDay.get(Calendar.HOUR));             // 12시간 체계
        System.out.println("min: " + birthDay.get(Calendar.MINUTE));
        System.out.println("sec: " + birthDay.get(Calendar.SECOND));

        /* 설명. SimpleDateFormat 활용(java.util.Date형으로 반환) */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E요일");
        String birthDayString = sdf.format(new java.util.Date(birthDay.getTimeInMillis()));
        System.out.println("birthDayString: " + birthDayString);
    }
}
