package org.example.B240413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    백준 11726번 : 2×n 타일링

    https://www.acmicpc.net/problem/11726
 */

public class four {

    static int[] box;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(n));
    }

    static int fibonacci(int n){
        box = new int[1001];
        box[1] = 1;
        box[2] = 2;

        for(int i=3; i<=n; i++){
            box[i] = (box[i-1] + box[i-2]) % 10007;
        }
        return box[n];
    }
}
