package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;

// 이상한 문자 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12930
public class create_strange_characters {
    public static void main(String[] args) throws IOException {
        String s = "try hello world";

        create_strange_characters m = new create_strange_characters();

        System.out.println(m.solution(s));
    }

    public String solution(String s) {
        String[] temp = s.split("");
        String answer = "";
        int count = 0;

        for(int i=0; i<temp.length; i++){
            if(!temp[i].equals(" ")){
                answer += (count == 0 || count%2==0) ? temp[i].toUpperCase() : temp[i];
                count++;
            }else{
                answer += " ";
                count = 0;
            }
        }
        return answer;
    }
}
