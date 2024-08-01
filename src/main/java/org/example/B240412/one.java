package org.example.B240412;

import java.io.*;
import java.util.*;

public class one {


    static int N;
    static int count;
    static int[][] time;

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int result =0;
        N = Integer.parseInt(br.readLine());
        time =new int[N][2];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<2; j++){
                time[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<N-1; i++){
            count = 1;
            int end = time[i][1];
            for(int j=i; j<N; j++){
                int nextstart = time[j][0];
                int nextend = time[j][1];

                if(end <= nextstart){
                    end = nextend;
                    count++;
                }
            }
            result = Math.max(result,count);
        }

        System.out.println(result);
    }
}