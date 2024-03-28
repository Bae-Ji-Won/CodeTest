package org.example.B240328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


/*
    백준 1546번 문제 : 평균

    https://www.acmicpc.net/problem/1546
 */
public class average {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int max = 0;
        double[] nums = new double[count];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<count; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(max < temp) max = temp;
            nums[i] = temp;
        }
        int finalMax = max;

        nums = Arrays.stream(nums).map(i -> ( i / finalMax) * 100).toArray();

        System.out.printf("%.6f",Arrays.stream(nums).sum()/count);
    }
}

