package org.example.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.LongStream;

// 콜라츠 추측
// https://school.programmers.co.kr/learn/courses/30/lessons/12943
public class Colatz_Guess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int num = Integer.parseInt(br.readLine());


        Colatz_Guess m = new Colatz_Guess();

        System.out.println(m.solution(num));
    }

    public int solution(int num){
        int result = num;
        int count = 0;

        while(result !=1) {
            switch (result % 2) {
                case 0:
                    result /= 2;
                    break;
                case 1:
                    result = result*3+1;
                    break;
            }
            count++;
            if(count >= 500){
                count = -1;
                break;
            }
        }
        return count;
    }
}
