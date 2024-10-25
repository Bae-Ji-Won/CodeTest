package org.example.T240409;

import java.io.*;
import java.util.*;


/*
        백준 1863번 문제 : 스카이라인 쉬운거
        https://www.acmicpc.net/problem/1863

    힌트에서 주어진 것을 보면
    1. 높이에 따른 건물
    2. 너비에 따른 건물
    2가지 경우에 카운트를 진헹한다.
 */
public class three {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 가장 최근에 들어온 값을 다음 값과 비교해야하므로 stack 사용
        Stack<Integer> stack= new Stack<>();
        long count = 0;

        int n = Integer.parseInt(br.readLine());

        // 건물 높이에 따른 건물 개수 구하기
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 높이에 따른 건물 개수 구하기이므로 y좌표만 필요함
            st.nextToken();
            int y = Integer.parseInt(st.nextToken());

            // stack에 저장된 최근 건물의 높이가 y보다 크거나 같을 경우 건물 개수 추가
            if(!stack.isEmpty() && stack.peek() > y){
                count++;
                stack.pop();
            }
            // 다음 건물의 높이가 이전과 같을경우 스택에 저장 안함
            if(!stack.isEmpty() && stack.peek() == y){
                continue;
            }
            if(y == 0){
                continue;
            }
            stack.push(y);
        }

        for(int i=0; i<stack.size(); i++){
            count++;
        }
        System.out.print(count);
    }
}
