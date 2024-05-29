package org.example.Programmers.StackQue;

/*
    https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=java


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "()()";

        Main2 main = new Main2();

        System.out.println(main.solution(str));
    }

    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i =0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(c=='(')     // (입력시 stack 저장
                stack.push(c);
            else if(stack.empty()) {     // 만약 스택이 비어있는 상태에 )입력시 false 출력
                return false;
            }
            else            // (있는 상태에서 )입력시 pop
                stack.pop();
        }
        return stack.empty();
    }
}
