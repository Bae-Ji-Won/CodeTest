package org.example.B240328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


/*
    백준 20291번 문제 : 파일 정리

    https://www.acmicpc.net/problem/20291
 */
public class Organize_your_files {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        Map<String, Integer> files = new HashMap<>();

        for(int i =0; i<count; i++){
            String str = br.readLine().split("\\.")[1];

            if (files.containsKey(str)) {
                files.put(str, files.get(str) + 1);
            } else {
                files.put(str, 1);
            }
        }
        files.keySet().stream().map(i -> i + " "+ files.get(i)).sorted().forEach(System.out::println);
    }
}

