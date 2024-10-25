package org.example.B240413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class one {
    static int[] f;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        f = new int[n+1];

        fib(n);
        sb.append(count + " ");

        count = 0;
        fibonacci(n);

        sb.append(count+" ");
        System.out.println(sb);
    }

    static int fib(int n){
        if(n == 1 || n == 2){
            count++;
            return 1;
        }else{
            return (fib(n-1) + fib(n-2));
        }
    }


    static int fibonacci(int n){
        f[1] = 1;
        f[2] = 1;

        for(int i=3; i<=n; i++){
            count++;
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }
}
