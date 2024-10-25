package org.example.P240806;

import java.util.Arrays;

/*  프로그래머스 : 문자열을 정수로 바꾸기
    https://school.programmers.co.kr/learn/courses/30/lessons/12925
 */
public class One {
    public static void main(String[] args) {
        String n = "-1234";
        One one = new One();
        System.out.println(one.solution(n));
    }

    public int solution(String s) {

        int answer = Integer.parseInt(s);

        return answer;
    }
}
