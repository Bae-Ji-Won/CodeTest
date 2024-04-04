package org.example.B240404;

import java.io.*;
import java.util.*;


/*
    백준 2075번 문제 : N번째 큰 수

    https://www.acmicpc.net/problem/2075

 */

public class Nth_largest_number {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                q.add(Integer.valueOf(st.nextToken()));
            }
        }

        for(int i=1; i<N; i++){
            q.poll();
        }

        System.out.println(q.peek());
    }
}

