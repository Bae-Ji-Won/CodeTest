package org.example.B240411;

import java.io.*;
import java.util.*;

/*
    백준 8911번 : 거북이
    https://www.acmicpc.net/problem/8911
 */

public class two {

    // 위, 오른쪽, 아래, 왼쪽
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int[][] result;

    public static void main(String[] args) throws IOException {
        var br  = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            ArrayList<Integer> xlist = new ArrayList<>();
            ArrayList<Integer> ylist = new ArrayList<>();

            String root = br.readLine();

            result = new int[root.length()][2];
            int direction = 0;
            int x=0;
            int y=0;

            xlist.add(0);
            ylist.add(0);

            for(int j=0; j<root.length(); j++){
                char c = root.charAt(j);

                switch (c){
                    case 'F':
                        x= x+dx[direction];
                        y= y+dy[direction];
                        xlist.add(x);
                        ylist.add(y);
                        break;

                    case 'L':
                        if(direction-1<0) direction = 3;
                        else direction -= 1;
                        break;

                    case 'R':
                        if(direction+1>3) direction = 0;
                        else direction += 1;
                        break;

                    case 'B':
                        x = x+(dx[direction]*-1);
                        y = y+(dy[direction]*-1);
                        xlist.add(x);
                        ylist.add(y);
                }
            }

            int height = Collections.max(ylist) - Collections.min(ylist);
            int wide = Collections.max(xlist) - Collections.min(xlist);

            System.out.println(height * wide);
        }
    }
}
