package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// 문자열 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12917
public class Arrange_strings_in_descending_order {
    public static void main(String[] args) throws IOException {
        String s = "Zbcdefg";

        Arrange_strings_in_descending_order m = new Arrange_strings_in_descending_order();

        System.out.println(m.solution(s));
    }

    public String solution(String s) {

        String answer = "";

        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        for(String a : str)
            answer += a;

        return answer;
    }
}
