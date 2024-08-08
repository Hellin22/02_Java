package com.ohgiraffers.chap03.section01.graph_search;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* 수업목표. BFS와 방문 배열을 활용한 최단거리 문제를 해결할 수 있다. */
public class Application3 {
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    static boolean[][] visit;
    static int[][] map;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int N, M;

    static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }


    public static int solution(String input) throws IOException{
        BufferedReader br = toBufferedReader(input);
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visit = new boolean[N][M];

        /* 설명. 입력값이 공백 없이 이어서 들어옴에 따라 한 문자씩 뜯어서 int 배열(map)에 옮겨닮는 반복문 */
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            char[] ch = str.toCharArray(); // 문자열 -> char[]

            for (int j = 0; j < M; j++) {
                map[i][j] = Character.getNumericValue(ch[j]);       // '1' -> 숫자 1
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        visit[0][0] = true;                 // start 위치 방문 체크부터 시작
        bfs(0, 0);

        System.out.println(map[N - 1][M - 1]);
        return map[N-1][M-1];               // 도착지(우하단) 위치의 값을 반환(도착할 때까지의 최적의 경로 수)
    }

    private static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x, y));

        while(!q.isEmpty()){
            Node n = q.poll();

            /* 설명. 상하좌우를 둘러보는 개념의 for문(벽 or 유효한 범위 or 지나온 길) */
            for (int i = 0; i < 4; i++) {
                int nx = n.x + dx[i];
                int ny = n.y + dy[i];

                /* 설명. 지금 보는 좌표가 전체 범위를 벗어난 경우라면 */
                if(nx < 0 || nx >= N || ny < 0 || ny >= M) continue;

                /* 설명. 방문 했던 좌표이거나 벽이라면 */
                if(visit[nx][ny] || map[nx][ny] == 0) continue;

                q.add(new Node(nx, ny));
                map[nx][ny] = map[n.x][n.y] + 1;

                visit[nx][ny] = true;
            }
        }
    }
}
