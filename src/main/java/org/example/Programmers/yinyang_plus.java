package org.example.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// 음양 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/76501
public class yinyang_plus {
    public static void main(String[] args) throws IOException {
        int[] absolutes = {1,2,3};
        boolean[] signs = {false,false,true};

        yinyang_plus m = new yinyang_plus();

        System.out.println(m.solution(absolutes,signs));
    }

    public int solution(int[] absolutes, boolean[] signs){
        int result = 0;

        for(int i=0 ; i<absolutes.length; i++){
            result += signs[i] ?  absolutes[i] : absolutes[i] * -1;
        }

        return result;
    }

/*
     class Solution {
        public int solution(int[] absolutes, boolean[] signs){
            int result = 0;

            for(int i=0 ; i<absolutes.length; i++){
                if(signs[i]){
                    result += absolutes[i];
                }else{
                    result += absolutes[i] * -1;
                }
            }
            return result;
        }
    }
 */

}
