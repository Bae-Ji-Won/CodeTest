package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;

// 행렬의 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/12950
public class matrix_addition {
    public static void main(String[] args) throws IOException {
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};

        matrix_addition m = new matrix_addition();

        System.out.println(m.solution(arr1, arr2));
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i =0; i<arr1.length; i++){
            for(int j = 0; j<arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

}
