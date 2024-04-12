package org.example.B240412;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    백준 1916번 : 최소비용 구하기
    https://www.acmicpc.net/problem/1916
 */

public class two {

    static class Node implements Comparable<Node>{
        int to,value;

        public Node(int to, int value){
            this.to = to;
            this.value = value;
        }

        @Override
        public int compareTo(Node o) {
            return this.value - o.value;
        }
    }

    static List<Node>[] list;
    static boolean[] visit;
    static int[] distance;

    public static void main(String[] args) throws IOException {
    var br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());

    list = new ArrayList[N+1];
    visit = new boolean[N+1];
    distance = new int[N+1];

    for(int i=1; i<N+1; i++){
        list[i] = new ArrayList<>();
        distance[i] = Integer.MAX_VALUE;
    }

    StringTokenizer st;

    for(int i=0; i<M; i++){
        st = new StringTokenizer(br.readLine());
        int from = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());
        int value = Integer.parseInt(st.nextToken());

        list[from].add(new Node(to,value));

    }

    st = new StringTokenizer(br.readLine());
    int startNode = Integer.parseInt(st.nextToken());
    int endNode = Integer.parseInt(st.nextToken());

    dijkstra(startNode);
    System.out.println(distance[endNode]);
    }

    static void dijkstra(int startNode){
        Queue<Node> queue = new PriorityQueue<>();
        distance[startNode] = 0;
        queue.offer(new Node(startNode,0));


        while (!queue.isEmpty()){
            Node cur = queue.poll();    // 최소 가중치를 가진 노드(큐에는 인접한 노드 중 value가 낮은 순으로 정렬되어 있음)


            if(visit[cur.to]){
                continue;
            }

            // 현재 방문한 노드 true 변경
            visit[cur.to] = true;

            for(Node next : list[cur.to]){
                if(distance[cur.to] + next.value <= distance[next.to]){
                    distance[next.to] = distance[cur.to] + next.value;
                    queue.offer(new Node(next.to, distance[next.to]));
                }
            }
        }
    }
}
