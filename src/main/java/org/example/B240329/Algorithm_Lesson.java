package org.example.B240329;

import java.io.*;
import java.util.StringTokenizer;


/*
    백준 24313번 문제 : 알고리즘 수업 - 점근적 표기 1

    https://www.acmicpc.net/problem/24313
 */
public class Algorithm_Lesson {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        System.out.println(((a1*n0 + a0 <= c*n0) && (a1 <= c))? 1 : 0);
    }
}

/*
-7 -7
-14 <= 8
    f(n) = 7n + 7, g(n) = n, c = 8, n0 = 1이다. f(1) = 14, c × g(1) = 8이므로 O(n) 정의를 만족하지 못한다.

    f(n) = 7n + 7, g(n) = n, c = 8, n0 = 10이다. 모든 n ≥ 10에 대하여 7n + 7 ≤ 8n 이므로 O(n) 정의를 만족한다.

    f(n) <= c*g(n) , g(n) = n
    7n + 7  <= 8*n
    14 <= 8

    77 <= 80


    7 -2
    6
    1

    21 - 2  <= 18

    21 <= 18

    21 -1 <= 18


 */

