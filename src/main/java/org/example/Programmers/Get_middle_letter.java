package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;

// 가운데 글자 가져오기
// https://school.programmers.co.kr/learn/courses/30/lessons/12903
public class Get_middle_letter {
    public static void main(String[] args) throws IOException {
        String s = "qwer";

        Get_middle_letter m = new Get_middle_letter();

        System.out.println(m.solution(s));
    }

    public String solution(String s){
        int mid = s.length() / 2;

        System.out.println(mid);
        if(s.length() %2 == 0){
            return s.substring(mid -1, mid+1);
        }else{
            return String.valueOf(s.charAt(mid));
        }
    }

}
