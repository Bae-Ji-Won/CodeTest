package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

// 부족한 금액 계산하기
// https://school.programmers.co.kr/learn/courses/30/lessons/82612
public class Calculate_your_shortfall {
    public static void main(String[] args) throws IOException {
        int price = 3;
        int money = 20;
        int count =  4;

        Calculate_your_shortfall m = new Calculate_your_shortfall();

        System.out.println(m.solution(price,money,count));
    }

    public long solution(int price, int money, int count) {
        long temp = 0;

        for(int i=1; i<=count; i++){
            temp += price * i;
        }
        long answer = Math.max(temp-money,0);

        return answer;
    }
}
