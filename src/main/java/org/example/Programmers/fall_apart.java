package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;

// 나누어 떨어지는 숫자 배열
// https://school.programmers.co.kr/learn/courses/30/lessons/12910
public class fall_apart {
    public static void main(String[] args) throws IOException {
        fall_apart fa = new fall_apart();

        int[] array = {2, 36, 1, 3};
        System.out.println(Arrays.toString(fa.solution(array,1)));

    }

    public int[] solution(int[] arr,int divisor){

        int[] result = Arrays.stream(arr).filter(i -> i % divisor ==0 ).sorted().toArray();

        if(result.length == 0){
            result = new int[] {-1};
        }
        return result;
    }
}
