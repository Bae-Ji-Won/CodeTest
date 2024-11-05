package org.example.test;

import java.io.*;
import java.util.*;

public class Main03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList();

        String[] str = br.readLine().split(":",-1);

        int check = 0;


        // 1:2:3:4:5:6:7:: 경우
        if((str.length > 8) && (str[str.length-1].equals(str[(str.length -1)-1]))){
            str = Arrays.copyOf(str,8);
        // ::1:2:3:4:5:6:7 경우
        }else if((str.length > 8) && (str[0].equals(str[1]))){
            str = Arrays.copyOfRange(str,1,str.length);
        }


        for(String s : str){
                if (str.length < 8 && check == 0) {
                    if (s.equals("")) {
                        for (int i = 0; i < 8 - str.length; i++) {
                            list.add(s);
                        }
                        check = 1;
                    }
                }
            list.add(s);
        }

        for(int i=0; i<8; i++){
            // 공백일 경우 0000으로 채워넣기
            if(list.get(i).equals("")){
                list.set(i,"0000");
            }else {
                int zerocount = 4 - list.get(i).length();
                for(int j = 0; j<zerocount; j++){
                    list.set(i,"0"+list.get(i));
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(String s : list){
            sb.append(s);
            sb.append(":");
        }

        sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}