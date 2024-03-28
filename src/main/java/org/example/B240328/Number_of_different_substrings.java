package org.example.B240328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


/*
    백준 11478번 문제 : 서로 다른 부분 문자열의 개수

    https://www.acmicpc.net/problem/11478
 */
public class Number_of_different_substrings {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        HashSet list= new HashSet();

        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                list.add(str.substring(i,j));
            }
        }
        list.add(1);
        System.out.println(list.size());
    }
}

