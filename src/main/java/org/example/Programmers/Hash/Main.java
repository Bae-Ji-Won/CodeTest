package org.example.Programmers.Hash;

/*
    https://school.programmers.co.kr/learn/courses/30/lessons/42577?language=java

    프로그래머스 전화번호 목록
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = {"119", "97674223", "1195524421"};

        Main main = new Main();

        System.out.println(main.solution(arr));
    }

    public boolean solution(String[] phone_book){
        HashMap<String, Integer> map = new HashMap<>();

        // Hash안에 데이터 순서대로 넣기
        for(int i = 0; i < phone_book.length; i++){
            map.put(phone_book[i],i);
        }

        for(int i = 0; i < phone_book.length; i++){
            for(int j = 0; j<phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }
        return true;
    }
}


