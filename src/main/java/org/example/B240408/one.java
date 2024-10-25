package org.example.B240408;

import java.io.*;
import java.util.*;

public class one {

    static ArrayList<ArrayList<Integer>> list = new ArrayList();
    static boolean[] visit;
    static int count = 0;
    static int[] result;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        // visit 체크 배열 false 초기화
        visit = new boolean[N+1];
        // 결과값 담을 배열
        result = new int[N];

        // list 초기화  => list = {list{},list{}}
        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
           StringTokenizer st2 = new StringTokenizer(br.readLine());
           int x = Integer.parseInt(st2.nextToken());
           int y = Integer.parseInt(st2.nextToken());

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
        for(int i=0; i<list.size(); i++){
            Collections.sort(list.get(i));
        }

        dfs(R);

        for(int i:result){
            sb.append(i+"\n");
        }

        System.out.println(sb);

    }

    // 최상위 노드부터 깊이 우선 탐색을 통해 이동하는 노드의 순서를 출력하면 됨
    // 즉, 입력받은 R노드의 자식노드의 낮은 값부터 순차적으로 출력해주면 됨
    // 또한 최상위 노드에서 갈 수 없는 노드는 0으로 출력하기 때문에 카운트 할 필요 없음
    static void dfs(int depth) {

        visit[depth] = true;

        result[count] = depth;

        // list의 depth번째 list의 크기만큼 반복함
        // list = {{2,4},{1,3,4},{2,4},{1,2,3}}
        // {2,4} 진행일때.
        for(int i=0; i<list.get(depth).size(); i++){
            int nextdepth = list.get(depth).get(i);     // depth가 1일때, list의 첫번째 인덱스인 {2,4}의 첫번째 값인 2부터 진행

            // 현재 depth를 한번도 지나간적이 없다면
            if(!visit[nextdepth]){
                count++;
                dfs(nextdepth);
            }
        }
    }
}
