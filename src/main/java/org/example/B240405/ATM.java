package org.example.B240405;

import java.io.*;
import java.util.*;

/*
    백준 11399번 문제 : ATM

    https://www.acmicpc.net/problem/11399
 */
public class ATM {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] person = new int[N];

        StringTokenizer st =new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            person[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(person);

        int result = 0;

        for(int i=0; i<N; i++){
            int sum = 0;

            for(int j=0; j<i+1; j++){
                sum += person[j];
            }
            result += sum;
        }
        System.out.println(result);
    }
}
