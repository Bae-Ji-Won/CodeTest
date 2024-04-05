package org.example.B240405;

import java.io.*;
import java.util.*;


/*
    백준 1339번 문제 : 단어 수학

    https://www.acmicpc.net/problem/1339
 */
public class word_math {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] values = new int[26];


        for(int i=0; i<N; i++){
            String s = br.readLine();
            // values 배열안 해당 알파벳 자리에 해당 알파벳의 자릿수를 저장함
            // 4321일 경우 i=0일때, 10의 3승인 1000을 저장함
            for(int j =0; j<s.length(); j++){
                int a = values[s.charAt(j) - 'A'] += (int)Math.pow(10,s.length()-1-j);
            }
        }
        // 정렬을 통해 오름차순 정렬함
        Arrays.sort(values);

        int maxNum = 9;
        int result = 0;
        for(int i=25; i>0; i--){
            result += values[i]*maxNum;
            maxNum --;
        }

        System.out.println(result);
    }
}
