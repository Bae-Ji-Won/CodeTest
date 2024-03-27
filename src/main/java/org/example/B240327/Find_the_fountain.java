package org.example.B240327;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    백준 1193번 문제 : 분수 찾기

    https://www.acmicpc.net/problem/1193
 */
public class Find_the_fountain {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        int linehap = 0;
        int linenum = 0;

        // 입력받은 수가 몇번째 자리인지 구하는 곳
        // 7 -> 1+2+3
        /*
            1 - linehap : 1, linenum : 1
            2 - linehap : 3, linenum : 2
            3 - linehap : 6, linenum : 3
            4 - linehap : 10, linenum : 4
         */
        while(linehap<x){
            linenum ++;
            linehap += linenum;
        }

        // 짝수일 경우
        if(linenum %2 == 0){
            System.out.println((linenum - (linehap - x)) + "/" + (linenum + (((linehap - linenum) - x) + 1)));
        }else {
            System.out.println((linenum + (((linehap - linenum) - x) + 1)) + "/" + (linenum - (linehap - x)));
        }

    }
}

