package org.example.P240812;


import java.util.stream.IntStream;

/*  프로그래머스 : 서울에서 김서방 찾기

    https://school.programmers.co.kr/learn/courses/30/lessons/12919
 */
public class One {
    public static void main(String[] args) {
        String[] seoul = {"Jane","Kim"};

        One one = new One();
        System.out.println(one.solution(seoul));
    }

    public String solution(String[] seoul){
        String toFind = "Kim";

        int index = IntStream.range(0,seoul.length)
                .filter(i -> seoul[i].contains(toFind))
                .findFirst()
                .orElse(-1);

        return "김서방은 "+index+"에 있다";
    }
}
