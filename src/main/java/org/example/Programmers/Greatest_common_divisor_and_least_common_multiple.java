package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;

// 최대공약수와 최소공배수
// https://school.programmers.co.kr/learn/courses/30/lessons/12940
public class Greatest_common_divisor_and_least_common_multiple {
    public static void main(String[] args) throws IOException {
        int n = 2;
        int m = 5;

        Greatest_common_divisor_and_least_common_multiple d = new Greatest_common_divisor_and_least_common_multiple();

        System.out.println(Arrays.toString(d.solution(n,m)));
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = Greatest_Common_Divisor(Math.max(n,m),Math.min(n,m));
        answer[1] = Least_Common_Multiple(n*m,answer[0]);

        return answer;
    }

    private int Greatest_Common_Divisor(int max, int min){
        if(min == 0) return max;
        return Greatest_Common_Divisor(min,max%min);
    }

    private int Least_Common_Multiple(int gop,int greatest){
        return gop/greatest;
    }

}
