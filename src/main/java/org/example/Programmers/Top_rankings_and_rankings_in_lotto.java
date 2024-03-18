package org.example.Programmers;

import java.io.IOException;
import java.util.Arrays;

// 로또의 최고 순위와 최저 순위
// https://school.programmers.co.kr/learn/courses/30/lessons/77484
public class Top_rankings_and_rankings_in_lotto {
    public static void main(String[] args) throws IOException {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};

        Top_rankings_and_rankings_in_lotto m = new Top_rankings_and_rankings_in_lotto();

        System.out.println(Arrays.toString(m.solution(lottos,win_nums)));
    }

    public int[] solution(int[] lottos, int[] win_nums) {

        int result[] = new int[]{highest_ranking(lottos,win_nums),lowest_ranking(lottos,win_nums)};


        for(int i = 0; i<result.length; i++){
            switch (result[i]){
                case 0 :
                    result[i] = 6;
                    break;
                case 1 :
                    result[i] = 6;
                    break;
                case 2:
                    result[i] = 5;
                    break;
                case 3:
                    result[i] = 4;
                    break;
                case 4:
                    result[i] = 3;
                    break;
                case 5:
                    result[i] = 2;
                    break;
                case 6:
                    result[i] = 1;
                    break;
            }
        }
        return result;
    }


    protected int highest_ranking(int[] lottos, int[] win_nums){
        return (int) Arrays.stream(lottos)
                .filter(i -> i==0 || Arrays.stream(win_nums).anyMatch(j -> j == i))
                .count();
    }

    protected int lowest_ranking(int[] lottos, int[] win_nums){
        return (int) Arrays.stream(lottos)
                .filter(i -> Arrays.stream(win_nums).anyMatch(j -> j == i))
                .count();
    }

}
