package org.example.test;

import java.io.*;
import java.util.StringTokenizer;

public class Main01 {
    static int[] switchs;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int switchNum = Integer.parseInt(br.readLine());

        switchs = new int[switchNum];

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 스위치 상태 입력
        for(int i=0; i<switchNum; i++){
            switchs[i] = Integer.parseInt(st.nextToken());
        }
        
        // 학생수
        int studentNum = Integer.parseInt(br.readLine());

        for(int i=0; i<studentNum; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            // 남자일 경우
            if(Integer.parseInt(st2.nextToken()) == 1){
                int menSwitch = Integer.parseInt(st2.nextToken());

                // 입력받은 번호에 해당하는 스위치 on/off
                switchOnOff(menSwitch);

                if(menSwitch*2 <= switchNum){
                    switchOnOff(menSwitch*2);
                }
            }
            // 여자일 경우
            else{
                int womenSwitch = Integer.parseInt(st2.nextToken());

                switchOnOff(womenSwitch);

                for(int j =womenSwitch-1; j>0; j--){
                    // 좌우 대칭중 왼쪽 값 (왼쪽값을 기준으로 대칭되는 오른쪽 값을 구할 수 있음)
                    int numtemp = j;
                    // 오른쪽 값이 배열의 크기보다 작을경우에만 진행
                    if( (womenSwitch*2 - numtemp)-1 < switchNum) {
                        if ((numtemp - 1 >= 0) && (switchs[numtemp - 1] == switchs[(womenSwitch * 2 - numtemp) - 1])) {
                            switchOnOff(numtemp);
                            switchOnOff(womenSwitch * 2 - numtemp);
                        } else break;
                    }else break;
                }
            }
        }


        int count = 0;
        for(int i : switchs) {
            if(count == 20){
                System.out.println();
                count = 0;
            }
            System.out.print(i + " ");
            count++;
        }

    }

    static void switchOnOff(int switchNum){
        if(switchs[switchNum-1] == 0)switchs[switchNum-1] = 1;
        else switchs[switchNum-1] = 0;
    }
}
