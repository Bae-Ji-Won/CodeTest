package org.example.T240409;

import java.io.*;
import java.util.*;

/*
        백준 13975번 문제 : 파일 합치기 3
        https://www.acmicpc.net/problem/13975
 */

public class two {

    static long[] files;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            int K = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            files = new long[K];

            for(int j=0; j<K; j++){
                int num = Integer.parseInt(st.nextToken());
                files[j] = num;
            }

            sb.append(bfs() + "\n");
        }

        System.out.println(sb);
    }

    // 제일 작은 값 2개씩 더해주면 된다.
    static long bfs(){
        PriorityQueue<Long> queue = new PriorityQueue<>();
        long total = 0;
        
        for(int i=0; i< files.length; i++){
            queue.offer(files[i]);
        }
        
        // 큐가 비어있을떄까지 반복
        while(!queue.isEmpty()){
            // 큐안에 데이터가 1개 이하라면 더 이상 더할 수 없기에 break
            if(queue.size() ==1){
                break;
            }
            // 큐 안에 가장 작은값, 2번쨰로 작은 값
            long min = queue.poll();
            long min2 = queue.poll();

            total += min+min2;

            queue.offer(min+min2);
        }

        return total;
    }
}
