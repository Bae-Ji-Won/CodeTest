package org.example.B240327;


/*
    백준 2445번 문제 : 별 찍기

    https://www.acmicpc.net/problem/2445
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String star = "*";
        star = star.repeat(num*2);

        upStar(star,num);
        downStar(star,num);
    }

    static void upStar(String star, int num){
        for(int i=1; i<=num; i++){
            int startIndex = i;
            int endIndex = (num*2)-i;

            String beforeStar = star.substring(0,startIndex);
            String afterStar = star.substring(endIndex);

            String temp = " ";
            String midStar = temp.repeat((num*2)-(i*2));

            System.out.println(beforeStar + midStar + afterStar);
        }
    }

    static void downStar(String star, int num){
        for(int i=num-1; i>=0; i--){
            int startIndex = i;
            int endIndex = (num*2)-i;

            String beforeStar = star.substring(0,startIndex);
            String afterStar = star.substring(endIndex);

            String temp = " ";
            String midStar = temp.repeat((num*2)-(i*2));

            System.out.println(beforeStar + midStar + afterStar);
        }
    }
}
