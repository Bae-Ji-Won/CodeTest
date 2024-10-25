package org.example.P240808;


import java.util.Arrays;


/*  프로그래머스 : 정수 내림차순으로 배치하기

    https://school.programmers.co.kr/learn/courses/30/lessons/12933
 */
public class Two {
    public static void main(String[] args) {
        int n = 118372;

        Two one = new Two();
        System.out.println(one.solution(n));
    }

    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();

        for(String i : list){
            sb.append(i);
        }

        return Long.parseLong(String.valueOf(sb.reverse()));
    }
}
