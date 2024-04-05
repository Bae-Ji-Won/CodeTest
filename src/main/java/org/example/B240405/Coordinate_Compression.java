package org.example.B240405;

import java.io.*;
import java.util.*;


/*
    백준 18870번 문제 : 좌표 압축

    https://www.acmicpc.net/problem/18870
 */
public class Coordinate_Compression {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> nums = new ArrayList();
        ArrayList<Integer> sortnums = new ArrayList();

        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<Integer,Integer> map  = new HashMap<>();

        // 원본 값 저장하는 리스트와 정렬된 값 저장하는 리스트 2개에 데이터 넣기
        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(st.nextToken());
            nums.add(temp);
            sortnums.add(temp);
        }

        // 정렬
        Collections.sort(sortnums);

        StringBuilder sb = new StringBuilder();

        int count =0;

        // map안에 값에 대한 우선순위 값 넣어줌
        for(int i=0; i<N; i++){
            int num = sortnums.get(i);
            
            if(!map.containsKey(num)){
                map.put(num,count);
                count++;
            }
        }

        for(int i:nums){
            sb.append(map.get(i)+" ");
        }

        System.out.println(sb);
    }
}
