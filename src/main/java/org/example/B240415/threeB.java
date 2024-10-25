package org.example.B240415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class threeB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st  = new StringTokenizer(br.readLine());

        int AN = Integer.parseInt(st.nextToken());
        int BN = Integer.parseInt(st.nextToken());

        int[] nums = new int[AN + BN];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<AN+BN; i++){
            if(i == AN){
                st = new StringTokenizer(br.readLine());
            }

            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        for(int i:nums){
            System.out.print(i + " ");
        }
    }
}
