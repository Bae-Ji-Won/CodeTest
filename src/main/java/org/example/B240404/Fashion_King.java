package org.example.B240404;

import java.io.*;
import java.util.*;


/*
    백준 9375번 문제 : 패션왕 신해빈

    https://www.acmicpc.net/problem/9375

    모든 경우의 수를 따지기 위해서는

    headgear                eyewear
    
    hat             
                            sunglasses
    turban
                            아무것도 안입음
    아무것도 안입음

    (3 * 2) - 1(둘다 아무것도 안입는 경우)
 */

public class Fashion_King {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // TestCase
        int tc = Integer.parseInt(br.readLine());


        for(int i =1; i<=tc; i++){
            int num = Integer.parseInt(br.readLine());

            Map<String,Integer> hm = new HashMap<>();

            for(int j=0; j<num; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                // 의상의 이름은 필요없음
                st.nextToken();
                String kind = st.nextToken();

                // 의상 종류,개수만 map에 저장함
                hm.put(kind,hm.getOrDefault(kind,0)+1);
            }

            int result = 1;

            for(int m : hm.values()){
                result *= m+1;
            }
            System.out.println(result -1);
        }
    }
}

