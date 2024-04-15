package org.example.B240415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    백준 1713번 : 후보 추천하기
    https://www.acmicpc.net/problem/1713
 */

public class two {

    static class Node {
        int num, cnt;

        public Node(int num, int cnt) {
            this.num = num;
            this.cnt = cnt;
        }
    }

    static PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>() {
        @Override
        public int compare(Node n1, Node n2) {
                return n1.cnt - n2.cnt;
        }
    });

    static int[] student = new int[21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            int temp = Integer.parseInt(st.nextToken());
            student[temp] = student[temp] + 1;
        }

        for(int i=1; i< student.length; i++){
            int temp = student[i];
            // 액자가 꽉차 있을 경우
            if(temp == 0) continue;

            if(queue.size() == N){
                queue.poll();
            }

            queue.offer(new Node(i,temp));
        }

        int[] temp = new int[N];


        for(int i=0; i<N; i++){
            Node node = queue.poll();
            temp[i] = node.num;
        }

        Arrays.sort(temp);

        for(int i : temp){
            System.out.print(i + " ");
        }

    }
}
