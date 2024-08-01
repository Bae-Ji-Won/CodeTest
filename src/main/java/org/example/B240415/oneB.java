package org.example.B240415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class oneB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N+1];

        for(int i=1; i<=N; i++){
            nums[i] = i;
        }

        int cnt = 0;

        for(int st = 1; st<=N; st++){
            int total = nums[st];
            int en = st;

            while(en<N && total<N){
                en++;

                total += nums[en];
            }

            if(total == N) cnt++;
        }

        System.out.println(cnt);
    }
}
