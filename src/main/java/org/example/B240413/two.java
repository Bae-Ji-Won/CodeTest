package org.example.B240413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
    백준 2775번 : 부녀회장이 될테야

    https://www.acmicpc.net/problem/2775
 */


public class two {

    static int[][] person;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
           int k = Integer.parseInt(br.readLine());
           int n = Integer.parseInt(br.readLine());

           person = new int[k+1][n+1];

            System.out.println(fibonacci(k,n));
        }
    }

    static int fibonacci(int k, int n){

        // 0층 인원
        for(int i=1; i<=n; i++){
            person[0][i] = i;
        }

        for(int i=1; i<=k; i++){
            for(int j=1; j<=n; j++){
                for(int d=1; d<=j; d++){
                    person[i][j] += person[i-1][d];
                }

            }
        }
        return person[k][n];
    }
}
