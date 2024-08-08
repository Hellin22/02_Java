package com.ohgiraffers.chap03.section01.graph_search;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* 수업목표. BFS와 x, y 좌표를 활용한 문제를 해결할 수 있다. (feat. 배열의 인덱스와 좌표는 반대개념) */
/* 필기.
 *   너비우선탐색(Breath-First Search)
 *    선입선출 구조의 큐 활용
 *    시작 노드에서 출발해 시작노드 기준으로 가까운 노드를 먼저 방문하면서 탐색하는 알고리즘
 * */
public class Application2 {

    public static BufferedReader toBufferedReader(String str) {

        return new BufferedReader(new InputStreamReader(System.in));
//        InputStream is = new ByteArrayInputStream(str.getBytes());
//        return new BufferedReader(new InputStreamReader(is));
    }

    /* 설명. bfs로 문제 해결을 하기 위한 queue */
    static Queue<Node> q = new LinkedList<Node>();

    /* 설명. 상하좌우 개념의 좌표 배열 */
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    /* 설명. 배추밭 */
    static int map[][];

    /* 설명. 방문한 배추 좌표 배열 */
    static boolean visit[][];

    /* 설명. 현재 위치에 대한 좌표 */
    static int curx, cury;

    /* 설명. 배추밭의 크기(너비/높이), 심어진 배추의 수 */
    static int N;
    static int M;
    static int K;

    /* 설명. 필요한 배추흰지렁이의 수 */
    static int count;

    /* 설명. x, y 좌표를 가지는 static 내부 클래스 */
    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String str = br.readLine();
        while(st.hasMoreTokens()) {
            String string = st.nextToken();
        }
        // String s = "0 0 1 2 1 3 1 1 1 4";
        // 0 0
        // 1 2
        // 1 3
        // 1 1
        // 1 4
        //
        String s = br.readLine();
        String[] strs = s.split(" ");
        for(int i = 0; i < strs.length; i+=2) {
            int x = Integer.parseInt(strs[i]);
            int y = Integer.parseInt(strs[i+1]);
            map[x][y] = 1;
        }
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visit = new boolean[N][M];

        /* 설명. 배추밭에 배추 심기 */
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            map[y][x] = 1;
        }

        count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                /* 설명. 방문 안한 위치에 배추가 심어져 있다면(지렁이를 심자) */
                if (visit[i][j] == false && map[i][j] == 1) {
                    count++;
                    /* 설명. 해당 위치 및 붙어있는 배추밭을 방문체크하고 que로 제거(붙어있는 배추 묶음 파악) */
                    bfs(i, j);      // bfs의 인자는 x, y좌표 순으로
                }
            }
        }

        return count;
    }

    /* 설명. 상하좌우에 배추가 심어져 있으면 한번씩 동작 */
    static void bfs(int x, int y) {
        q.add(new Node(x, y));
        visit[x][y] = true;

        /* 설명. 연속적으로 상하좌우에 배추가 있다면 해당 위치를 방문한 것으로 체크하고 que를 통해 비워내는 작업 반복 */
        while (!q.isEmpty()) {
            Node cur = q.poll();

            /* 설명. 상하좌우 살펴보기 */
            for (int i = 0; i < 4; i++) {
                curx = cur.x + dx[i];
                cury = cur.y + dy[i];

                /* 설명. 지금 보는 방향이 좌표로써 존재하면서 방문한적이 없고 배추가 심어져 있다면 */
                if (range_check() && visit[curx][cury] == false && map[curx][cury] == 1) {
                    q.add(new Node(curx, cury));
                    visit[curx][cury] = true;
                }
            }
        }
    }

    public static boolean range_check() {
        return curx >= 0 && curx < N && cury >= 0 && cury < M;
    }
}
