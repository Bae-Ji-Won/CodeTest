package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;

// 삼총사
// https://school.programmers.co.kr/learn/courses/30/lessons/131705
public class three_musketeers {
    public static void main(String[] args) throws IOException {
        int[] numbers = {-2, 3, 0, 2, -5};

        three_musketeers m = new three_musketeers();

        System.out.println(m.solution(numbers));
    }

    static int answer = 0;
    public int solution(int[] number) {
        combination(number, 3, 0, 0, new int[3]);;
        return answer;
    }

    public static void combination(int[] number, int limit, int startIdx, int cnt, int[] selectArr) {
        if (cnt == limit) {
            answer += Arrays.stream(selectArr).sum() == 0? 1 : 0;
            return;
        }

        for (int i=startIdx; i<number.length; i++) {
            selectArr[cnt] = number[i];
            combination(number, limit, i+1, cnt+1, selectArr);
        }
    }

}
