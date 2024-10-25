package org.example.B240801;

/*  프로그래머스 : 나머지가 1이 되는 수 찾기
    https://school.programmers.co.kr/learn/courses/30/lessons/87389
 */
public class Two {
    public static void main(String[] args) {
        int n = 12;
        Two one = new Two();
        System.out.println(one.solution(n));
    }

    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<n; i++){
            if(n%i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
