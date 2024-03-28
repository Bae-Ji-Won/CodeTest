package org.example.B240328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


/*
    백준 1157번 문제 : 단어공부

    https://www.acmicpc.net/problem/1157
 */
public class word_study {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        Integer[] count = new Integer[26];
        Arrays.fill(count, 0);

        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)-65]++;
        }


        int max = 0;
        for(int i=1; i<count.length; i++){
            if(count[i] > count[max])
                max = i;
        }

        Arrays.sort(count,Collections.reverseOrder());

        System.out.println(count[0] == count[1] ? "?" : (char)(max+65));
    }
}

