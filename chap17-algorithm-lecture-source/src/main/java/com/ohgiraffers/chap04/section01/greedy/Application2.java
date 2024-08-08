package com.ohgiraffers.chap04.section01.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class Application2 {

    public static BufferedReader toBufferedReader(String str){
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static int solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());       // 동전의 종류
        int k = Integer.parseInt(st.nextToken());       // 계산 할 금액(가치의 합)

        int[] coin = new int[n];
        for (int i = 0; i < coin.length; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = n-1; i >= 0; i--) {
            if(coin[i] <= k){

                /* 설명. 현재 동전 종류로 최대 지불할 수 있는 금액(동전의 수) */
                count += (k/coin[i]);

                /* 설명. 방금 지불하고 남는 금액을 다음 동전을 위해 k에 대입 */
                k %= coin[i];
            }
        }

        return count;
    }
}
