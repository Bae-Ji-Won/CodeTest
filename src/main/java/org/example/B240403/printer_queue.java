package org.example.B240403;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


/*
    백준 1966번 문제 : 프린터 큐

    https://www.acmicpc.net/problem/1966
    
    [문제풀이]
    1. 중요도 확인
    2. 큐 안에 현재 문서보다 중요한게 1개라도 있다면 현재 문서를 큐의 마지막으로 이동시킴
    3. 사용자에게 테스트 케이스 총 수, 문서의 개수, 몇번째 문서가 궁금한지

    [피드백]
    가장 큰 중요도만 구할 수 있지 않나??

 */
public class printer_queue {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 수
        int testCase = Integer.parseInt(br.readLine());


        // 테스트 케이스 수만큼 반복
        for(int i = 0; i<testCase; i++){
            // 우선순위 내림차순 정렬
            Queue<int[]> queue = new LinkedList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());

            // 문서의 개수
            int N = Integer.parseInt(st.nextToken());
            // 찾을 문서가 몇번째에 놓여있는지
            int M = Integer.parseInt(st.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());

            // 문서 채우기
            for(int j=0; j<N; j++){
                int temp= Integer.valueOf(st2.nextToken());

                // index,우선순위
                queue.add(new int[]{j,temp});
            }


            int max = 0;
            int count = 0;

            while(!queue.isEmpty()){
                // 최대값 찾기
                max = Collections.max(queue.stream().map(s -> s[1]).collect(Collectors.toList()));
                // 최대값보다 작을경우 큐 반대편으로 보냄
                if(queue.peek()[1] < max){
                    // 임시로 큐값을 저장할 공간
                    Queue<int[]> qtemp = new LinkedList<>();
                    qtemp.add(queue.peek());
                    // 기존 큐 맨 앞 데이터 삭제
                    queue.poll();
                    // 뒤로 붙이기
                    queue.add(qtemp.peek());
                }else{
                    // 현재 큐의 최상위 값의 인덱스가 처음에 찾고 싶은 문서의 자리와 같을때 while문 종료 
                    if(queue.peek()[0] == M){
                        count++;
                        break;
                    }
                    // 최대값과 같지만 찾고자하는 index번호가 아닐 경우
                    queue.poll();
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

