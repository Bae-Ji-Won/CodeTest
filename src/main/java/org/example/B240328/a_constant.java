package org.example.B240328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
    백준 2908번 문제 : 상수

    https://www.acmicpc.net/problem/2908
 */
public class a_constant {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(new StringBuilder(str[0]).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(str[1]).reverse().toString());

        System.out.println(Math.max(a,b));
    }
}

