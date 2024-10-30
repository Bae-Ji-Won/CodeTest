package org.example.CodeStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    https://www.acmicpc.net/problem/1072
    1072번 : 게임
 */
public class B241029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);

        B241029 b241029 = new B241029();
        int result = b241029.solution(x,y);

        System.out.println(result);
    }

    public int solution(int x,int y){
        int z = 0;

        z = (int)((((double)y/(double)x))*100);
        int count = 0;

        int xTemp = 0;
        int yTemp = 0;
        int zTemp = 0;


        while(true){
            xTemp = x+1;
            yTemp = y+1;
            zTemp = (int)((double)yTemp/(double)xTemp*100);

            count++;
            if(z != zTemp)
                break;
        }

        return count;
    }
}
