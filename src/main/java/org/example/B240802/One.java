package org.example.B240802;

import java.util.Arrays;

/*  프로그래머스 : 자연수 뒤집어 배열로 만들기
    https://school.programmers.co.kr/learn/courses/30/lessons/12932?language=java
 */
public class One {
    public static void main(String[] args) {
        long n = 12345;
        One one = new One();
        System.out.println(Arrays.toString(one.solution(n)));
    }

    public int[] solution(long n) {
        String s = String.valueOf(n);

        int[] answer = new int[s.length()];

        int cnt = 0;

        while(n > 0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
        return answer;
    }
}
