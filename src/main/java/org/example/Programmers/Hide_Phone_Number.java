package org.example.Programmers;

import java.io.IOException;

// 핸드폰 번호 가리기
// https://school.programmers.co.kr/learn/courses/30/lessons/12948
public class Hide_Phone_Number {
    public static void main(String[] args) throws IOException {
        String phone_number = "01033334444";

        Hide_Phone_Number m = new Hide_Phone_Number();

        System.out.println(m.solution(phone_number));
    }

    public String solution(String phone_number){
        String result = "";
        for(int i =0; i<phone_number.length() - 4; i++){
            result += "*";
        }

        result += phone_number.substring(phone_number.length() -4);

        return result;
    }

}
