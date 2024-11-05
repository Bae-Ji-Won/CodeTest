package org.example.CodeStudy.P241029;

import java.io.IOException;
import java.util.Arrays;

/*
    https://school.programmers.co.kr/learn/courses/30/lessons/43238?language=java
    이분탐색 / 입국심사
 */
public class One {
    public static void main(String[] args) throws IOException {
        int n  = 6;
        int[] times = {7,10};

        One one = new One();

        System.out.println(one.solution(n, times));
    }

    public long solution(int n, int[] times) {
        Arrays.sort(times);
        // 최소 시간, 최대 시간
        long start = 1;
        long end = (long) times[times.length - 1] * n;

        while (start < end) {
            // 중간 시간
            long mid = (start + end) / 2;
            // 중간 시간 동안 몇명의 고객을 처리할 수 있는가
            long maxNum = 0;
            for (int i = 0; i < times.length; i++) {
                maxNum += mid / times[i];
                // mid 시간동안 처리할 수 있는 고객이 n 이상이되면 바로 for loop 탈출
                if (maxNum >= n) {
                    break;
                }
            }

            // start, end 업데이트
            if (maxNum < n) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        long answer = end;
        return answer;
    }
}
