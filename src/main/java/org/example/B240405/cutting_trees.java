package org.example.B240405;

import java.io.*;
import java.util.*;


public class cutting_trees {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong((st.nextToken()));
        int[] trees = new int[N];

        st = new StringTokenizer(br.readLine());

        int max = 0;
        int min = 0;
        // 나무 종류 저장
        for(int i=0; i<N; i++){
            int num = trees[i] = Integer.parseInt(st.nextToken());

            // 배열의 최대값 넣기
            if(max<num){
                max = num;
            }
        }

        // 이진 탐색
        while(min <max){

            long takeWood = 0;
            int mid = (max+min)/2;

            for(int j=0; j<N; j++){
                // 톱날 높이보다 나무가 긴 경우
                if(trees[j] > mid){
                    takeWood += trees[j] - mid;
                }
            }

            if(takeWood < M){
                max = mid;
            }else{
                min = mid +1;
            }
        }

        System.out.println(min -1);
    }
}