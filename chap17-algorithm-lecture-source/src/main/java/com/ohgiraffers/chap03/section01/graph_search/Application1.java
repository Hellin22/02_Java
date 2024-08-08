package com.ohgiraffers.chap03.section01.graph_search;

import java.io.*;
import java.util.StringTokenizer;


/* 수업목표. DFS를 활용(재귀)하는 예제 익히기 */
/* 필기.
*   깊이우선탐색(Depth-first-search)
*    후입선출 구조에 stack or 재귀함수를 사용한다.
*    한쪽 분기를 정하여 최대 깊이까지 탐색 후 분기를 이동하여 다시 탐색하는 알고리즘이다.
* */
public class Application1 {

    static boolean visit[];     // 방문 배열
    static int[][] map;         // 그래프를 2차원 배열로 매핑 (인접행렬)
    static int count = 0;       // 오염된 컴퓨터의 수
    static int node, edge;      // node와 edge의 개념을 저장

    /* 설명. 문자열에서 한줄씩 읽어들이기 위한 BufferedReader를 반환하는 메서드(readLine())*/
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static Integer solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        node = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());

        /* 설명. 2차원 배열 -> 인접 행렬 */
        map = new int[node+1][node+1]; // 0번 인덱스 사용 x
        visit = new boolean[node+1];

        for(int i = 0; i < edge; i++){
            StringTokenizer str = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

//            map[a][b] = 1;
//            map[b][a] = 1;
            map[a][b] = map[b][a] = 1;
        }

        dfs(1);

        return count - 1;
    }

    /* 설명. 재귀함수로 dfs 알고리즘을 구현할 메서드 */
    public static void dfs(int start){
        visit[start] = true;
        count++;

        for(int i = 1; i <= node; i++){
            if(map[start][i] == 1 && !visit[i]){
               dfs(i);
            }
        }
    }
}
