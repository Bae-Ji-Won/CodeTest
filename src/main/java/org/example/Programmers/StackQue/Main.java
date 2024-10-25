package org.example.Programmers.StackQue;

/*
    https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=java


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        Main main = new Main();

        System.out.println(main.solution(progresses,speeds));
    }

    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();

        int count = 1;
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<progresses.length;i++) {
            int temp = (int)Math.ceil((double)(100 - progresses[i]) / speeds[i]);
            if(stack.isEmpty()){
                stack.push(temp);
            }else if (stack.peek() >= temp) {
                count++;
            }else if(stack.peek() < temp) {
                list.add(count);
                count = 1;
                stack.push(temp);
            }
            if(i == progresses.length-1){
                list.add(count);
            }

        }
        return list;
    }
}


