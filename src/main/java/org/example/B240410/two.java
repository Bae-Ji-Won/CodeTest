package org.example.B240410;

import java.io.*;
import java.util.*;

/*
    백준 10971번 : 외판원 순회 2
    https://www.acmicpc.net/problem/10971
 */

public class two {

    static int[][] distance;
    static boolean[] visit;
    static int N;
    static int Min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        distance = new int[N][N];
        visit = new boolean[N];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                distance[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 스타트 지점 1번 ~ 4번까지 지정
        for(int i=0; i<N; i++){
            visit[i] = true;
            dfs(i,i,0,0);
            visit[i] = false;
        }

        System.out.println(Min);
    }

    static void dfs(int start,int now, int cnt, int sum){

        // 마지막 출발지로 돌아가는 거리 더하기
        if(cnt == N-1){
            if(distance[now][start] != 0){
                sum += distance[now][start];
                Min = Math.min(Min,sum);
            }
        }


        for(int i=0; i<N; i++){
            // 본인 섬을 제외
            if(start == i)
                continue;
            // 이미 방문한 섬 제외
            if(visit[i])
                continue;
            // 다른 섬에서 값이 0이라 갈 수 없는 경우라면
            if(distance[now][i] == 0)
                continue;

            visit[i] = true;
            dfs(start,i,cnt+1,sum+distance[now][i]);
            visit[i] = false;
        }
    }
}
