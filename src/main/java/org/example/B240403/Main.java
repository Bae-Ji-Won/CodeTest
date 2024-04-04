package org.example.B240403;

import java.io.*;
import java.util.*;

    /*
        ArrayDeque vs LinkedDeque = 차이점 알기
    */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Deque<Ballon> dq = new ArrayDeque<>();

        // 터트리기 위해 이동하는 값
        int moveValue = Integer.parseInt(st.nextToken());

        sb.append("1 ");

        // 2번째 풍선부터 담기
        for(int i=1; i<N; i++){
            dq.add(new Ballon(i+1, Integer.parseInt(st.nextToken())));
        }

        while(!dq.isEmpty()) {
            // 이동 값이 양수일때
            if (moveValue > 0) {
                // 터트릴 풍선 바로 전까지의 풍선을 뒤로 넘김
                for(int i=1; i<moveValue; i++){
                    dq.addLast(dq.poll());
                }
                // 이번에 터트릴 풍선의 값 저장
                Ballon nextBallon = dq.poll();
                moveValue = nextBallon.moveValue;
                sb.append(nextBallon.index+" ");
            } else {
                // 이동값이 음수일 경우 moveValue는 음수이므로 -를 통해 양수로 바꿔줌
                for(int i=1; i< -moveValue; i++){
                    // dequeue안에 맨뒤에 있는 값을 맨 앞으로 이동시킴
                    dq.addFirst(dq.pollLast());
                }
                Ballon nextBallon = dq.pollLast();
                moveValue = nextBallon.moveValue;
                sb.append(nextBallon.index+" ");
            }
        }

        System.out.println(sb);
    }
}

class Ballon{
    int index;
    int moveValue;

    public Ballon(int index, int moveValue){
        this.index = index;
        this.moveValue = moveValue;
    }
}
