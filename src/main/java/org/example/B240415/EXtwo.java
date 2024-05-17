package org.example.B240415;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*
    백준 1806번 : 부분합
    https://www.acmicpc.net/problem/1806

 */

public class EXtwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(input.nextToken());
        int S = Integer.parseInt(input.nextToken());

        int[] nums = new int[N];

        input = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(input.nextToken());
        }

        int total = nums[0];
        int en = 0;
        int result = Integer.MAX_VALUE;

        for(int st=0; st<N; st++){
            while(en<N && total<S){
                en++;
                if(en != N) total += nums[en];
            }

            if(en == N) break;
            result = Math.min(result, en-st +1);
            total -= nums[st];
        }

        if(result == Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(result);
    }
}
