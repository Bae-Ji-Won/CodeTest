package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;

// 3진법 뒤집기
// https://school.programmers.co.kr/learn/courses/30/lessons/68935
public class Ternary_reversal {
    public static void main(String[] args) throws IOException {
        int n = 45;

        Ternary_reversal m = new Ternary_reversal();

        System.out.println(m.solution(n));
    }

    public int solution(int n) {
        StringBuilder str = new StringBuilder();
        int answer = 0;

        StringBuilder threebase = divisor(n,str);

        // 3진법 -> 10진법으로 바꾸는 법
        // Integer.parseInt("0021", 3);
        return Integer.parseInt(String.valueOf(threebase),3);
    }

    // 3진법 역순
    protected StringBuilder divisor(int n,StringBuilder str){
        if(n == 0) return str;
        int num = n/3;
        str.append(n%3);
        return divisor(num,str);
    }

}
