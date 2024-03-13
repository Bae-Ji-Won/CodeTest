package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;

// 없는 숫자 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/86051
public class Remove_Smallest_Number {
    public static void main(String[] args) throws IOException {
        int[] arr = {10};

        Remove_Smallest_Number m = new Remove_Smallest_Number();

        System.out.println(Arrays.toString(m.solution(arr)));
    }

    public int[] solution(int[] arr){
        if(arr.length <= 1){
            return new int[]{-1};
        }else{
            int min = Arrays.stream(arr).min().getAsInt();

            return Arrays.stream(arr)
                    .filter(i -> i != min)
                    .toArray();
        }
    }

}
