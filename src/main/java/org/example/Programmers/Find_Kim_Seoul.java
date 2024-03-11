package org.example.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

// 서울에서 김서방 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/12919
public class Find_Kim_Seoul {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] seoul = str.split(",");

        Find_Kim_Seoul m = new Find_Kim_Seoul();

        System.out.println(m.solution(seoul));
    }

    public String solution(String[] seoul){
        String toFind = "Kim";

        // contains사용시 Kimh로 해도 잡히기 때문에 해당 제어값 넣어줘야함
        int index = IntStream.range(0,seoul.length)
                .filter(i -> seoul[i].contains(toFind))
                .findFirst()
                .orElse(-1);

        return "김서방은 "+index+"에 있다";
    }

/*
    public String solution(String[] seoul){
        int x =  0;

        for(int i=0; i<seoul.length; i++){
        if(seoul[i].equals("Kim")) {
             x = i ;
        }
    }
    return "김서방은 "+ x + "에 있다";
 */

/*
    class Solution {
        public String solution(String[] seoul) {
            return "김서방은 "+ Arrays.asList(seoul).indexOf("Kim") + "에 있다";
        }
    }
 */
}
