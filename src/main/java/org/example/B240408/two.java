package org.example.B240408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class two {
    static ArrayList<ArrayList<Integer>> list = new ArrayList();
    static boolean[] visit;
    static int count = 1;
    static StringBuilder sb = new StringBuilder();
    static int[] result;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        // visit 체크 배열 false 초기화
        visit = new boolean[N+1];
        result = new int[N+1];

        // list 초기화  => list = {list{},list{}}
        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 2차원 리스트에 데이터 저장
            /*  1 4
                1 2
                2 3
                2 4
                3 4 입력시
             list = {{4,2},{1,3,4},{4,2},{1,2,3}} 저장
             */
            list.get(x).add(y);
            list.get(y).add(x);
        }

        // {4,5},{3},{

        // 리스트의 이중 값 정렬(인접 정점은 오름차순으로 방문하기 때문)
        for(int i=1; i<list.size(); i++){
            Collections.sort(list.get(i));
        }

        bfs(R);


    }


    static void bfs(int depth) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(depth);

        visit[depth] = true;
        result[depth] = count++;

        // queue가 없을때까지 반복
        while(!queue.isEmpty()){
            int root = queue.poll();

            // root의 자식노드 모두 반복하여 이미 체크하지 않은 값은 result에 담고, 큐에도 넣어줌
            for(int i : list.get(root)){
                if(!visit[i]){
                    visit[i] = true;
                    result[i] = count++;

                    queue.offer(i);
                }
            }
        }

        for(int i=1; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
