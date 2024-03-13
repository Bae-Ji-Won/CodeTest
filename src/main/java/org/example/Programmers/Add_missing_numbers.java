package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;

// 없는 숫자 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/86051
public class Add_missing_numbers {
    public static void main(String[] args) throws IOException {
        int[] numbers = {1,2,3,4,6,7,8,0};

        Add_missing_numbers m = new Add_missing_numbers();

        System.out.println(m.solution(numbers ));
    }

    public  int solution(int[] numbers){
        return 45 - Arrays.stream(numbers).sum();
    }

}
