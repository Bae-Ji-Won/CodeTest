package org.example.B240731;

/* 프로그래머스 : 평균 구하기
   https://school.programmers.co.kr/learn/courses/30/lessons/12944?language=java

 */
public class One {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        One one=new One();
        System.out.println(one.solution(arr));
    }

    public double solution(int[] arr) {
        double answer = 0;
        for(int i: arr){
            answer += i;
        }
        return answer / arr.length;
    }
}
