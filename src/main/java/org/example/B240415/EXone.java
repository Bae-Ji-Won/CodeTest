package org.example.B240415;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
    백준 2230번 : 수 고르기
    https://www.acmicpc.net/problem/2230

    투 포인터 문제를 풀고 싶어서 해당 문제 풀어봤습니다
 */

public class EXone {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;

        int[] nums = new int[N];

        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);
        int end=0;

        for(int start=0; start<N; start++){
            // 마지막 값의 인덱스가 N보다 작고 start 인덱스의 값 - end 인덱스이 값이 M보다 작을때 end 인덱스 증가시킴
// 위에서 정렬을 하지 않고 Math.abs(nums[end] - nums[start])를 사용할 수 없는 이유는?
            while(end <N && nums[end] - nums[start] < M) end++;
            if(end == N) break;

            min = Math.min(min, nums[end] - nums[start]);
        }
        System.out.println(min);
    }
}
