package org.example.Programmers;

import java.io.IOException;
import java.util.stream.LongStream;


// 크기가 작은 부분 문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/147355
public class small_substring {
    public static void main(String[] args) throws IOException {
        String t = "500220839878";
        String p = "7";

        small_substring m = new small_substring();

        System.out.println(m.solution(t,p));
    }

    public int solution(String t, String p) {
        long targetNumber = Long.parseLong(p);
        int targetNumberLength = p.length();

        return (int) LongStream.range(0L, t.length() - targetNumberLength + 1L)
                .mapToObj(i -> t.substring((int) i, (int) i + targetNumberLength))
                .mapToLong(Long::parseLong)
                .filter(number -> number <= targetNumber)
                .count();
    }

//    public int solution(String t, String p) {
//        int answer = 0;
//        int length = p.length();
//
//        for(int i =0; i<t.length()-(length-1); i++){
//            if(Long.parseLong(t.substring(i,i+length)) <= Long.parseLong(p)){
//                answer ++;
//            }
//        }
//        return answer;
//    }

}
