package org.example.B240404;

import java.io.*;
import java.util.*;
/*
    백준 15903번 문제 : 카드 합체 놀이

    https://www.acmicpc.net/problem/15903


 */

public class card_combination_game {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        PriorityQueue<Long> q = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
                q.add(Long.valueOf(st.nextToken()));
        }

        for(int i=0; i<m; i++){
            long hap = q.poll() + q.poll();

            q.add(hap);
            q.add(hap);
        }
        System.out.println(q.stream().mapToLong(Long::longValue).sum());
    }
}
