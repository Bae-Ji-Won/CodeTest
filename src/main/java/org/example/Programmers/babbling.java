package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

// 옹알이 (2)
// https://school.programmers.co.kr/learn/courses/30/lessons/133499
public class babbling {
    public static void main(String[] args) throws IOException {
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

        babbling m = new babbling();

        System.out.println(m.solution(babbling));
    }

    public int solution(String[] babbling) {
        int answer = 0;
        String[] sound = {"aya","ye","woo","ma"};
        String[] doublesound = {"ayaaya","yeye","woowoo","mama"};

        for(int i =0; i<babbling.length; i++){
            String ba = babbling[i];

            // 중복단어 말했을때 경우
            if((int)Arrays.stream(doublesound)
                    .filter(s -> ba.contains(s))
                    .count() >0) continue;

            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].replace(" ", "");

            if(babbling[i].length()  == 0) answer++;
        }

        return answer;
    }
}
