package com.ohgiraffers.cahp06.section01.dp;

import java.io.*;

/* 설명. 동적 계획법(Dynamic Programming) 알고리즘을 활용하는 예제를 이해할 수 있다. */
/* 필기.
*   복잡한 전체 문제를 작은 부분 문제에 대한 최적의 해결 방법을 고안(누적)하여 해결하는 알고리즘
*   규칙이 보이는 구간들에 대한 점화식을 세워 작은 문제들을 해결하면 전체 문제의 최적 값이 나온다.
* */
public class Application1 {

    public static BufferedReader toBufferedReader(String str){
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static int solution(int N) throws IOException {
        int[] dp = new int[N + 1];

        /* 설명. dp 배열의 5번 인덱스까지에 대한 처리(1~5 까지) */
        if(N >= 3) dp[3] = 1;
        if(N >= 5) dp[5] = 1;

        for (int i = 6; i <= N; i++) {
            if(dp[i-3] == 0 || dp[i-5] == 0) dp[i] = Math.max(dp[i-3], dp[i-5]) + 1;
            else dp[i] = Math.min(dp[i-3], dp[i-5]) + 1;
            if(dp[i] == 1) dp[i] = 0;
        }
        System.out.println();
        if(dp[N] == 0) return -1;
        return dp[N];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = toBufferedReader("18");

        solution(Integer.parseInt(br.readLine()));

    }
}
