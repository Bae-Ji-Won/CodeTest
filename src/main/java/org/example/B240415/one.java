package org.example.B240415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    백준 11305번 : 주유소
    https://www.acmicpc.net/problem/13305
 */

public class one {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dis = new int[N-1];
        int[] gas = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<dis.length; i++){
            dis[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            gas[i] = Integer.parseInt(st.nextToken());
        }

        int temp = gas[0];
        int total = 0;

        for(int i=0; i<dis.length; i++){

            if(temp>gas[i]){
                temp = gas[i];
            }

            total += temp*dis[i];
        }

        System.out.println(total);
    }
}
