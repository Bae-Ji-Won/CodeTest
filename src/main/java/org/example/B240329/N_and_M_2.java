package org.example.B240329;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;


/*
    백준 15650번 문제 : N과 M (2)

    https://www.acmicpc.net/problem/15650
 */
public class N_and_M_2 {

    static int N;
    static int M;
    static int[] arr;
    static boolean[] visitCheck;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        arr = new int[M];
        visitCheck = new boolean[N];

        dfs(0);

        System.out.println(sb);

    }

    static void dfs(int depth){
        if(depth == M){
            for(int i : arr){
                sb.append(i + " ");
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            // 값이 flase일때 동작
            if (!visitCheck[i]) {
                //중복 방지를 위해 visitCheck[0] = true 변환
                visitCheck[i] = true;
                // arr[0] = 1; 1 뒤의 값 구하기
                arr[depth] = i + 1;
                dfs(depth + 1);

                visitCheck[i] = false;
            }
        }
    }
}

