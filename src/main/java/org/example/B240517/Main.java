package org.example.B240517;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    https://www.acmicpc.net/problem/15650

    백준 15650번 문제 : N과 M(2)
 */
public class Main {

    public static int[] arr;
    public static int N,M;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        dfs(1,0);

        System.out.println(sb);
    }

    public static void dfs(int at, int depth){
        if(depth == M){
            for(int val : arr){
                sb.append(val).append(' ');
            }

            sb.append('\n');
            return;
        }

        for(int i = at; i < N; i++){
            arr[depth] = i;
            dfs(at+1, depth+1);
        }
    }
}
