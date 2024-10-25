package org.example.B240411;

import java.io.*;
import java.util.*;

/*
    백준 17086번 : 아기 상어2
    https://www.acmicpc.net/problem/17086
 */

public class one {

    static class Node{
        int x,y,count;

        public Node(int x,int y,int count){
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    static int[][] box;
    static int N,M;
    static boolean[][] visit;
    static int[] dx = {-1,-1,-1,0,1,1,1,0};
    static int[] dy = {-1,0,1,1,1,0,-1,-1};

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        box = new int[N][M];

        int result = 0;
        int temp =0 ;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                box[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                int num = box[i][j];
                if(num != 1){
                    temp = bfs(i,j);
                    result = Math.max(result,temp);
                }
            }
        }
        System.out.println(result);

    }

    static int bfs(int x, int y){
        visit = new boolean[N][M];
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x,y,0));
        visit[x][y] = true;

        while (!queue.isEmpty()){
            Node now = queue.poll();
            for(int i=0; i<8; i++){
                int nextx = now.x + dx[i];
                int nexty = now.y + dy[i];
                int cnt = now.count;

                if(nextx < 0 || nexty < 0 || nextx >= N || nexty >= M)
                    continue;
                if(visit[nextx][nexty] == true)
                    continue;
                if(box[nextx][nexty] == 1)
                    return cnt +1;
                visit[nextx][nexty] = true;
                queue.add(new Node(nextx,nexty,cnt+1));
            }
        }
        return 0;
    }
}
