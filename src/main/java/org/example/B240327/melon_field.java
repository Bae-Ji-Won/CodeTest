package org.example.B240327;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    백준 2477번 문제 : 참외밭

    https://www.acmicpc.net/problem/2477
 */
public class melon_field {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1m당 자라는 참외 개수
        int melonNum = Integer.parseInt(br.readLine());

        int[] tempnums = {0,0,0,0};
        int[] nums = new int[6];
        int MaxHeight = 0, MaxWide = 0;
        int MinHeight = 99999, MinWide = 99999;
        int count = 0;

        // 사용자에게 입력받는 숫자 중 가로,세로 최대값,최솟값 구함
        for(int i=0; i<6; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int digit = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            // 이미 들어있는 값과 비교하여 최솟값 구함(최솟값이 파여져 있는 공간의 높이, 넗이임)
            if(tempnums[digit-1] != 0){
                if(count == 0) {
                    MinWide = Math.min(tempnums[digit - 1], num);
                    count++;
                }else {
                    MinHeight = Math.min(tempnums[digit - 1], num);
                }
            }

            tempnums[digit-1] = tempnums[digit-1] + num;
            nums[i] = num;

        }
        MaxHeight = Math.max(tempnums[0],tempnums[1]);
        MaxWide = Math.max(tempnums[2],tempnums[3]);

        System.out.println(((MaxHeight*MaxWide) - (MinHeight*MinWide)) * melonNum);
    }
}