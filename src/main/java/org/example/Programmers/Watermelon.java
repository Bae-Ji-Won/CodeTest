package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;

// 수박수박수박수박수박수?
// https://school.programmers.co.kr/learn/courses/30/lessons/12922
public class Watermelon {
    public static void main(String[] args) throws IOException {
        int n = 3;

        Watermelon m = new Watermelon();

        System.out.println(m.solution(n));
    }

    public String solution(int n){
        String answer = "";

        for(int i=0; i<n; i++){
            answer += i%2 == 0 ? "수" : "박";
        }
        return answer;
    }

}
