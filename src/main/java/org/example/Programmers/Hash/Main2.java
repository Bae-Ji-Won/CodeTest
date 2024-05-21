package org.example.Programmers.Hash;

/*
    https://school.programmers.co.kr/learn/courses/30/lessons/42578

    프로그래머스 의상

 */

import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Main2 main = new Main2();
        System.out.println(main.solution(clothes));
    }

    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        int answer = 1;

        for(String[] cloth : clothes) {
            if(!map.containsKey(cloth[1])) {
                map.put(cloth[1], 1);
            }else{
                map.put(cloth[1], map.getOrDefault(cloth[1],1)+1);
            }
        }


        for(Integer val : map.values()) {
            answer *= val +1;
        }

        return answer -1;
    }
}
