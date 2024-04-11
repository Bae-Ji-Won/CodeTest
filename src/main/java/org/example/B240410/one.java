package org.example.B240410;

import java.io.*;
import java.util.*;

/*
    백준 1182번 : 부분수열의 합
    https://www.acmicpc.net/problem/1182
 */

public class one {

    static int[] nums;
    static int N;
    static int S;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        nums = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0,0);
        
        // 공집합은 존재하지 않으므로 만약 합을 0으로 입력받았을 경우 공집합의 경우인 1을 빼줘야 함
        if(S == 0){
            System.out.println(count-1);
        }else
            System.out.println(count);
    }

    /* 첫번째 값부터 2개의 경우의 수가 존재한다.
        (1) 아무것도 없는 경우
        [0, 0+(-7)]
        (2) 위의 2가지 경우에 대해 2가지 경우
        [0, 0+(-3), -7, -7+(-3)]

        이처럼 위의 경우에 수에 대해 경우의 수를 계속 해서 이어 나가게 되면 주어진 정수에 대해 부분수열을 구할 수 있다.
     */
    static void dfs(int depth, int sum){
        if(depth == N){
            if(sum == S)
                count++;
            return;
        }

        dfs(depth +1, sum + nums[depth]);
        dfs(depth +1,sum);
    }
}
