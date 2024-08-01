package org.example.B240416;

import java.io.*;
import java.util.*;

public class one {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());



        for(int i =0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            // 스티커 저장 공간
            int[][] stickers = new int[2][n+1];
            int[][] dp = new int[2][n+1];

            // 스티커 채우기
            for(int j = 0; j<2; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int k=1; k<=n; k++){
                    stickers[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            // 첫번째 행, 첫번째 열부터 채워지는 경우
            dp[0][1] = stickers[0][1];
            // 두번째 행, 첫번째 열부터 채워지는 경우
            dp[1][1] = stickers[1][1];
            
            for(int j = 2; j<=n; j++){
                dp[0][j] = Math.max(dp[1][j-1],dp[1][j-2]) + stickers[0][j];
                dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + stickers[1][j];
            }

            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
    }
}
