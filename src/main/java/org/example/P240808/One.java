package org.example.P240808;



/*  프로그래머스 : 정수 제곱근 판별

    https://school.programmers.co.kr/learn/courses/30/lessons/12934
 */
public class One {
    public static void main(String[] args) {
        int n = 121;
        int n2 = 3;

        One one = new One();
        System.out.println(one.solution(n));
    }

    public long solution(long n) {
        double answer =  Math.sqrt(n);
        if(answer % 1 == 0){
            return (long) Math.pow(answer+1,2);
        }

        return -1;
    }
}
