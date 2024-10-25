package org.example.B240406;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];

        double avg = 0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(br.readLine());
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            avg += nums[i];
        }

        int[] countNums = new int[N];

        Arrays.sort(nums);

        // 맵 값중 가장 큰값 찾기
        int max = Collections.max(map.values());

        System.out.println(max);

        int count =0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                countNums[count] = entry.getKey();
            }
            count++;
        }

        System.out.println(map);

        Arrays.sort(countNums);

        System.out.println("---- "+Arrays.toString(countNums));

        // 산술평균
        sb.append(Math.round(avg/N) +"\n");
        // 중앙값
        sb.append(nums[nums.length/2] + "\n");
        // 최빈값
        if(countNums.length > 1){
            sb.append(countNums[1] + "\n");
        }else{
            sb.append(countNums[0] + "\n");
        }

        //범위
        sb.append(nums[nums.length-1] - nums[0]);

        System.out.println(sb);
    }
}