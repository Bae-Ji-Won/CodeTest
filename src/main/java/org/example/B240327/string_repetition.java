package org.example.B240327;

/*
    백준 2675번 문제 : 문자열 반복

    https://www.acmicpc.net/problem/2675
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class string_repetition {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for(int j=0; j<str.length(); j++){
                System.out.print(str.substring(j,j+1).repeat(count));
            }

            System.out.println();
        }
    }
}
