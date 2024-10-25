package org.example.B240416;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class two {
    static class Node implements Comparable<Node>{
        int root, dis;

        public Node(int root, int dis){
            this.root = root;
            this.dis = dis;
        }

        @Override
        public int compareTo(Node o) {
            return this.dis - o.dis;
        }
    }

    static List<Node>[] list;
    static int[] dp;
    static boolean[] visit;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            list = new ArrayList[n+1];
            dp = new int[n+1];
            visit = new boolean[n+1];

            for(int j=1; j<=n; j++){
                list[j] = new ArrayList<>();
            }

            for(int j=0; j<d; j++){
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int dis = Integer.parseInt(st.nextToken());

                list[end].add(new Node(start,dis));
            }

            dijkstra(c);

            int time = 0;
            for(int j=1; j<= n; j++){
                if(dp[j] != Integer.MAX_VALUE)
                    time = Math.max(time,dp[j]);
            }

            System.out.println(count + " " + time);
        }
    }

    static void dijkstra(int start){
        Queue<Node> q= new PriorityQueue<>();
        Arrays.fill(dp,Integer.MAX_VALUE);
        q.offer(new Node(start,0));
        count = 0;

        dp[start] = 0;

        while(!q.isEmpty()){
            Node node = q.poll();
            int to = node.root;

            // 이미 방문한 루트는 지나침
            if(visit[to]) continue;

            visit[to] = true;
            count++;

            for(Node next : list[to]){
                if(dp[next.root] > dp[to] + next.dis){
                    dp[next.root] = dp[to] + next.dis;
                    q.offer(new Node(next.root,dp[next.root]));
                }
            }

        }
    }
}
