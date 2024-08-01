package org.example.B240415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class twoB {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(input.nextToken());
        int M = Integer.parseInt(input.nextToken());

        int[] nums = new int[N];

        input = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(input.nextToken());
        }

        int cnt = 0;


        for(int st = 0; st<N; st++){
            int total = nums[st];
            int en = st;

            while(en<N && total<M){
                en++;

                if(en != N) total += nums[en];
            }

            if(total == M) cnt++;
        }

        System.out.println(cnt);
    }
}
