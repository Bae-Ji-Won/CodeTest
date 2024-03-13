package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;

// 내적
// https://school.programmers.co.kr/learn/courses/30/lessons/70128
public class dot_product {
    public static void main(String[] args) throws IOException {
        int[] a = {-1,0,1};
        int[] b = {1,0,-1};

        dot_product m = new dot_product();

        System.out.println(m.solution(a,b));
    }

    public int solution(int[] a,int[] b){
        int count = a.length -1;
        int answer = 0;

        if(count <= 0) {
            answer += a[0] * b[0];
        } else {
            answer += a[count] * b[count] + solution(Arrays.copyOf(a,a.length-1),Arrays.copyOf(b,b.length-1));
        }
        return answer;
    }

    /*
        public int solution(int[] a, int[] b) {
            return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
        }
     */
}
