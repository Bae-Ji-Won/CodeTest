package org.example.B240801;

/*  프로그래머스 : 약수의 합
    https://school.programmers.co.kr/learn/courses/30/lessons/12928
 */
public class One {
    public static void main(String[] args) {
        int n = 12;
        One one = new One();
        System.out.println(one.solution(n));
    }

    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i<=n; i++){
            if(n%i==0){
                answer+=i;
            }
        }
        return answer;
    }
}
