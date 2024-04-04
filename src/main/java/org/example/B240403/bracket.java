package org.example.B240403;

import java.io.*;
import java.util.*;


/*
    백준 9012번 문제 : 괄호

    https://www.acmicpc.net/problem/9012
    
    [문제풀이]
    VPS = 올바른 괄호식
    () / (()) / (())() = VPS
    
    올바른 괄호식을 구하기 위해 열린 괄호와 닫힌 괄호가 쌍을 이루는지 확인해야함
    스택을 활용해

 */
public class bracket {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            Stack<String> stack = new Stack<>();
            String str = br.readLine();


            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == (')') && stack.contains("(")) stack.pop();
                else {
                    stack.add(String.valueOf(c));
                }
            }

            if (!stack.empty()) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}

