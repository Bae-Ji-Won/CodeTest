package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;

// 시저 암호
// https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class caesar_cipher {
    public static void main(String[] args) throws IOException {
        String s = "a Z z";
        int n = 51;

        caesar_cipher m = new caesar_cipher();

        System.out.println(m.solution(s,n));
    }

    public String solution(String s, int n){
        StringBuilder result = new StringBuilder("");
        s.chars()
                .forEach(c -> {
                    if (c == 32) {
                        result.append(" ");
                    } else {
                        if ((c<=90 &&(c + n > 90)) || (c>=97 &&c +n >122)) {
                            result.append((char) (c - 26 + n % 25));
                        } else {
                            result.append((char) (c + n));
                        }
                    }
                });

        return result.toString();
    }

}
