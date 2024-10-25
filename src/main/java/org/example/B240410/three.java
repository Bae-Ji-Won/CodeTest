package org.example.B240410;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class three {

    static boolean[] broke = new boolean[10];
    static int result,N,M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<M; i++){
            broke[Integer.parseInt(st.nextToken())] = true;
        }

        if(N == 100){
            System.out.println(0);
            return;
        }

        // 100부터 +,-해서 옮겨가는 횟수
        result = Math.abs(N-100);
        dfs(0,0);

        System.out.println(result);
    }

    static void dfs(int depth, int clicknums){
        for(int i=0; i<10; i++){
            // 버튼이 정상적일 경우만 진행
            if(!broke[i]){
                // 눌린 버튼
                int click = clicknums * 10 + i;
            }
        }
    }
}
