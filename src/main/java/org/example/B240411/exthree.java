package org.example.B240411;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
    3번 문제부터 너무 어려워서 풀지를 못하여 다른 문제를 풀었습니다
    백준 14940번 : 쉬운 최단거리
    https://www.acmicpc.net/problem/14940
 */

public class exthree {
    static int n,m;
    static int[][] table;
    static boolean[][] visit;
    // 위 오른쪽 아래 왼쪽
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        table = new int[n][m];
        visit = new boolean[n][m];
        int x= 0;
        int y = 0;

        for(int i =0; i<n; i++){
            st= new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                table[i][j] = Integer.parseInt(st.nextToken());
                
                // 0일경우 길 차단을 위해 true 변경
                if(table[i][j] == 0){
                    visit[i][j] = true;
                }

                if(table[i][j] == 2){
                    table[i][j] = 0;
                    x=i;
                    y=j;
                }
            }
        }

        bfs(x,y);

        for(int i=0; i<table.length; i++){
            for(int j=0; j<table[i].length; j++){
                if(table[i][j] == 1)
                System.out.println(table[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int bfs(int x,int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y,0});

        while(!queue.isEmpty()){
            int cur[] = queue.poll();
            for(int i=0; i<4; i++){
                int nextx = cur[0]+dx[i];
                int nexty = cur[1]+dy[i];
                int cnt = cur[2];

                if(nextx <0 || nexty<0 || nextx >= n || nexty >= m)
                    continue;
                if(visit[nextx][nexty] == true)
                    continue;
                if(table[nextx][nexty] == 0)
                    table[nextx][nexty] = cnt;

                queue.add(new int[]{nextx,nexty,cnt});
            }
        }
        return 0;
    }
}
