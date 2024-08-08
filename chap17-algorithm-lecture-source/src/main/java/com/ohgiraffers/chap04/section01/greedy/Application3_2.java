package com.ohgiraffers.chap04.section01.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Application3_2 {
    public static BufferedReader toBufferedReader(String str){
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static int solution(String input) throws IOException {

        int max_count = 0;
        BufferedReader br = toBufferedReader(input);
        int n = Integer.parseInt(br.readLine());
        ArrayList<Time> timeList = new ArrayList<>();

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());       // 시작시간
            int end = Integer.parseInt(st.nextToken());         // 종료시간
            Time discussion = new Time(start, end);
        }

        Collections.sort(timeList);
        int endTime = 0;
        for (Time time : timeList) {
            if(time.start == time.end){

            }
        }

        return max_count;
    }


}

class Time implements Comparable<Time> {

    public int start, end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {

        return 0;
    }
}
