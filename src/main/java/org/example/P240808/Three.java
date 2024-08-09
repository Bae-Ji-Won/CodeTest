package org.example.P240808;


import java.util.Arrays;


/*  프로그래머스 : 하샤드 수

    https://school.programmers.co.kr/learn/courses/30/lessons/12947
 */
public class Three {
    public static void main(String[] args) {
        int x = 10;

        Three one = new Three();
        System.out.println(one.solution(x));
    }

    public boolean solution(int x){

        // 문자로 입력받은 x를 String형으로 변환
        // chars()를 통해 문자열의 각 문자에 대해 IntStream 사용
        // map(c -> c - '0')을 통해 입력받은 문자열의 각 문자들에 아스키코드 문자'0'의 값을 제거하여 숫자를 구함
        // 예) "13" 을 입력받았을때, '1' 의 아스키코드의 값은 49이고 '0'의 아스키코드의 값은 48이므로 49-48 = 1이 값 반환
        // '3'일때는 51-48 = 3반환
        // 마지막으로 sum을 통해 위의 값 더해줌
        int sum = String.valueOf(x).chars().map(c -> c - '0').sum();

        return x % sum == 0;
    }
}
