package org.example.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.LongStream;

// 두 정수 사이의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/12912
public class SumBetween {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());


        SumBetween m = new SumBetween();

        System.out.println(m.solution(a,b));
    }

    public long solution(int a,int b){
        int min = Math.min(a,b);
        int max = Math.max(a,b);

        long result = LongStream.rangeClosed(min,max).sum();

        return result;
    }
}
