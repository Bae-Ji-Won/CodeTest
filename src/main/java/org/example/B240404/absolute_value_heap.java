package org.example.B240404;

import java.io.*;
import java.util.*;


/*
    백준 11286번 문제 : 절댓값 힙

    https://www.acmicpc.net/problem/11286

 */

public class absolute_value_heap {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 배열의 첫번째 값을 기준으로 정렬하기
        PriorityQueue<int[]> q = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) {
                    return a[0] - b[0]; // 첫 번째 요소를 기준으로 비교
                } else {
                    return a[1] - b[1]; // 첫 번째 요소가 같다면 두 번째 요소를 기준으로 비교
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            int x = Integer.parseInt(br.readLine());
            // x의 값이 0이고 큐가 비어있지 않을 경우
            if(x == 0 && !q.isEmpty()){
                sb.append(q.poll()[1]+"\n");
            }else if(x == 0){
                sb.append(x +"\n");
            }else {
                q.add(new int[]{Math.abs(x),x});
            }
        }

        System.out.println(sb);
    }
}

