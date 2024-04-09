package org.example.T240409;

import java.io.*;
import java.util.*;

/*
        백준 1697번 문제 : 숨바꼭질
        https://www.acmicpc.net/problem/1697
 */

public class one {

    static int count = 1;
    static int[] visit = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int result = bfs(N, K);
        System.out.println(result);
    }

    static int bfs(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        visit[n] = 1;

        /* depth값 마다 3번의 과정(+1,-1,*2)을 지나야함
           따라서 if문 4개를 통해서 구현 가능
           (1) 찾고 싶은 값과 같을경우
           (2) depth -1 일때
           (3) depth +1 일떄
           (4) depth *2 일때
           Queue 안에 값을 넣어 한개씩 값을 추출하여 위의 4가지 경우에 대해 진행
         */
        while (!queue.isEmpty()) {
            int depth = queue.poll();

            if (depth == k) {
                return visit[depth] - 1;
            }
            if (depth - 1 >= 0 && visit[depth - 1] == 0) {
                // depth-1의 위치에 이동 시간 저장
                visit[depth - 1] = visit[depth] + 1;
                queue.offer(depth - 1);
            }
            if (depth + 1 <= 100000 && visit[depth + 1] == 0) {
                visit[depth + 1] = visit[depth] + 1;
                queue.offer(depth + 1);
            }
            if (depth * 2 <= 100000 && visit[depth * 2] == 0) {
                visit[depth * 2] = visit[depth] + 1;
                queue.offer(depth * 2);
            }
        }
        return 0;
    }
}
