package org.example.Programmers;

import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

// 약수의 개수와 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/77884
public class Number_of_factors_and_addition {
    public static void main(String[] args) throws IOException {
        int left = 24;
        int right = 27;

        Number_of_factors_and_addition m = new Number_of_factors_and_addition();

        System.out.println(m.solution(left,right));
    }

    public int solution(int left, int right) {
        int[] nums = IntStream.rangeClosed(left,right).toArray();

        Map<Integer,Integer> numsmap = new HashMap<>();

        for(int i =0; i<nums.length; i++){
            float square = (float)Math.sqrt(nums[i]);   // 제곱근 구함
            int count = 0;

            for(int j=1; j<= square; j++){
                if(nums[i] % j ==0){
                    count++;
                }
            }

            count = nums[i] % square == 0.0 ? count*2 -1 : count*2;
            numsmap.put(count %2 == 0 ? nums[i] : nums[i] * -1,count);
        }

        return  numsmap.keySet()
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();
    }
}
