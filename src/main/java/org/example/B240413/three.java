package org.example.B240413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
    백준 1463번 : 1로 만들기

    https://www.acmicpc.net/problem/1463
 */

public class three {
    static int[] num;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        num = new int[N+1];
        System.out.println(fibonacci(N));
    }

    static int fibonacci(int N){
        num[1] = 0;
        
        for(int i=2; i<=N; i++){
            // 뒤에 1을 더해주는 이유는 해당 코드가 동작하는 것도 횟수 증가이므로
            num[i] = num[i-1] +1;

            if(i%2==0) num[i] = Math.min(num[i],num[i/2]+1);
            if(i%3==0) num[i] = Math.min(num[i],num[i/3]+1);
        }
        return num[N];
    }
}
