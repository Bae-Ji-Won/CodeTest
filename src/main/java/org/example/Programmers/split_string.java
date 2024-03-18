package org.example.Programmers;

import java.io.IOException;

// 문자열 나누기
// https://school.programmers.co.kr/learn/courses/30/lessons/140108
public class split_string {
    public static void main(String[] args) throws IOException {
        int n = 5;
        int[] lost = {2,4};
        int[] reseve = {1,3,5};

        split_string m = new split_string();

        System.out.println(m.solution(n,lost,reseve));
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int a = 0 , b = 0;


        return answer;
    }

    public int solution(String s) {
        int answer = 0;
        int t = 0, f = 0;
        char x = s.charAt(0);

        for(int i=0; i<s.length(); i++) {

            if(t==f) {
                answer++;
                x = s.charAt(i);
                System.out.println(x);
            } // 카운트보다 먼저 검사하는 것이 포인트!

            if(x == s.charAt(i)) t++;
            else f++;
        }
        return answer;
    }
}
