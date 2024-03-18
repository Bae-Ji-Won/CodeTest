package org.example.Programmers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 숫자 짝꿍 (다시 풀어야함)
// https://school.programmers.co.kr/learn/courses/30/lessons/131128
public class Static_number_partner {
    public static void main(String[] args) throws IOException {
        String X = "11223";
        String Y = "12334";

        Static_number_partner m = new Static_number_partner();

        System.out.println(m.solution(X,Y));
    }

    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        char[] xChars = X.toCharArray();
        char[] yChars = Y.toCharArray();

        Arrays.sort(xChars);
        Arrays.sort(yChars);

        int xId = xChars.length - 1;
        int yId = yChars.length - 1;


        while(xId >= 0 && yId >= 0){
            char x = xChars[xId];
            char y = yChars[yId];
            if(x == y){
                answer.append(xChars[xId]);
                xId--;
                yId--;
            } else if(x < y){
                yId--;
            } else {
                xId--;
            }
        }

        String reAnswer = answer.toString();
        long zeroCnt = reAnswer.chars()
                .filter(x -> x == '0').count();

        if(reAnswer.length() < 1){
            reAnswer = "-1";
        } else if( reAnswer.length() == zeroCnt){
            reAnswer = "0";
        }

        return reAnswer;
    }

//    public String solution(String x, String y) {
//
//        String answer = "";
//        int[] temp = new int[Math.min(x.length(),y.length())];      // 짝궁 값 담을 배열
//        int count = 0;
//
//        List<Integer> xlist = new ArrayList<>();
//        List<Integer> ylist = new ArrayList<>();
//
//        int[] xarr = Arrays.stream(x.split(""))
//            .mapToInt(Integer::parseInt)
//            .sorted()
//            .toArray();
//        int[] yarr = Arrays.stream(y.split(""))
//                .mapToInt(Integer::parseInt)
//                .sorted()
//                .toArray();
//
//
//        for(int i =0; i<x.length(); i++){
//            xlist.add(xarr[i]);
//        }
//
//        for(int i =0; i<y.length(); i++){
//            ylist.add(yarr[i]);
//        }
//
//        for(int i=0; i<temp.length; i++){
//            temp[i] = -1;
//        }
//
//        for(int i=0; i<xlist.size(); i++){
//            for(int j = 0; j<ylist.size(); j++){
//                if(xlist.get(i) == ylist.get(j)){
//                    temp[count] = xlist.get(i);
//                    int findnum = xlist.indexOf(xlist.get(i));
//                    xlist.remove(findnum);
//                    count ++;
//                }
//            }
//        }
//
//        if(count == 0){
//            return "-1";
//        }else{
//
//            reverseSort(temp);
//
//            for(int i : temp){
//                if(i != -1) answer += i;
//            }
//            return answer;
//        }
//    }
//
//    public static void reverseSort(int[] arr) {
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - i - 1];
//            arr[arr.length - i - 1] = temp;
//        }
//    }
}
