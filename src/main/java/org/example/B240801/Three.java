package org.example.B240801;

import java.util.Arrays;

/*  프로그래머스 : x만큼 간격이 있는 n개의 숫자
    https://school.programmers.co.kr/learn/courses/30/lessons/12954
 */
public class Three {
    public static void main(String[] args) {
        int n = 3;
        int x = 4;
        Three one = new Three();
        System.out.println(Arrays.toString(one.solution(x,n)));
    }

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i=1; i<=n; i++){
            answer[i-1] =(long) x * i;
        }
        return answer;
    }
}
