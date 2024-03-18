package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;

// 최소직사각형
// https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class Minimum_rectangle {
    public static void main(String[] args) throws IOException {
        int[][] size = {{60,50},{30,70},{60,30},{80,40}};

        Minimum_rectangle m = new Minimum_rectangle();

        System.out.println(m.solution(size));
    }
    /*
        60 50
     */
    public int solution(int[][] sizes) {
        int firstmax = Math.max(sizes[0][0],sizes[0][1]);
        int secondmax = Math.min(sizes[0][0],sizes[0][1]);

        for(int i=1; i< sizes.length; i++){
            firstmax = Math.max(firstmax,Math.max(sizes[i][0],sizes[i][1]));
            secondmax = Math.max(secondmax,Math.min(sizes[i][0],sizes[i][1]));
        }

        return firstmax*secondmax;
    }
}
