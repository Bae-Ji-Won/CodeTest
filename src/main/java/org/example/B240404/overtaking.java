package org.example.B240404;

import java.io.*;
import java.util.*;
/*
    백준 2002번 문제 : 추월

    https://www.acmicpc.net/source/76088156

 */

public class overtaking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 들어간 차
        Queue<String> in = new LinkedList<>();
        for(int i=0; i<N; i++) {
            in.add(br.readLine());
        }
        // 나온 차
        Queue<String> out = new LinkedList<>();
        for(int i=0; i<N; i++) {
            out.add(br.readLine());
        }

        int answer = 0;
        while(!out.isEmpty()) {
            String outCar = out.poll();
            if(!in.peek().equals(outCar)) {
                answer++;
                in.remove(outCar);
            } else in.poll();
        }

        System.out.println(answer);
        br.close();
    }
}
