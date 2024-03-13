package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;

// 문자열 다루기 기본
// https://school.programmers.co.kr/learn/courses/30/lessons/12918
public class String_handling_basics {
    public static void main(String[] args) throws IOException {
        String s = "1234";

        String_handling_basics m = new String_handling_basics();

        System.out.println(m.solution(s));
    }

    public boolean solution(String s){
        if(s.length() == 4 || s.length() == 6){
            return !s.matches(".*[A-z].*");
        }
        return false;
    }
}
