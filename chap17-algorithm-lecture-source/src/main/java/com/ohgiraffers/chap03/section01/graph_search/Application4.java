package com.ohgiraffers.chap03.section01.graph_search;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Application4 {
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    static boolean[] visit;
    static int[][] arr;
    static int node, line, start;

    static Queue<Integer> q = new LinkedList<Integer>();
    static StringBuilder sb = new StringBuilder();

    public static String solution(String input) throws IOException {

        /* 설명. 테스트 코드로 2번째부터 이전 테스트케이스 결과물인 문자열이 유지되고 있으면 누적되므로 초기화 */
        sb.delete(0, sb.length());

        BufferedReader br = toBufferedReader(input);
        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());       // 시작할 노드의 번호

        arr = new int[node + 1][node + 1];
        visit = new boolean[node + 1];

        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        dfs(start);
        sb.append("\n");

//        Arrays.fill(visit, false);
        visit = new boolean[node + 1];
        
        bfs(start);

        return sb.toString();       // StringBuilder -> String
    }

    private static void dfs(int start) {
        visit[start] = true;
        sb.append(start + " ");

        /* 설명. node 번호와 인덱스가 동일 -> i는 1부터 node 번호까지 반복되게 해야함.  */
        for(int i = 1; i <= node; i++) {
            if(arr[start][i] == 1 && visit[i] == false) {
                dfs(i);
            }
        }
    }

    private static void bfs(int start) {
        q.add(start);
        visit[start] = true;
        sb.append(start + " ");

        while(!q.isEmpty()) {
            start = q.poll();

            for(int i = 1; i <= node; i++) {
                if(arr[start][i] == 1 && visit[i] == false) {
                    q.add(i);
                    visit[i] = true;
                    sb.append(i + " ");
                }
            }
        }

    }

}
