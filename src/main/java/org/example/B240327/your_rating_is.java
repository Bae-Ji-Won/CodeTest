package org.example.B240327;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
    백준 25206번 문제 : 너의 평점은

    https://www.acmicpc.net/problem/25206
 */
public class your_rating_is {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] score = {0.0,1.0,1.5,2.0,2.5,3.0,3.5,4.0,4.5};
        String[] grade = {"F","D0","D+","C0","C+","B0","B+","A0","A+"};

        double result = 0;
        double gradeScore = 0;

        for(int i =0; i<20; i++){
            String[] str = br.readLine().split(" ");
            if(!str[2].equals("P")) {
                result += score[Arrays.asList(grade).indexOf(str[2])] * Double.parseDouble(str[1]);
                gradeScore += Double.parseDouble(str[1]);
            }
        }
        System.out.printf("%.6f",result/gradeScore);
    }
}

