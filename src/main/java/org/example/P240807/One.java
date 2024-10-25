package org.example.P240807;

import java.util.Arrays;
import java.util.HashMap;

/*  프로그래머스 : 대충 만든 자판

    https://school.programmers.co.kr/learn/courses/30/lessons/160586
 */
public class One {
    public static void main(String[] args) {
        String[] keymap ={"ABACD", "BCEFD"};
        String[] targets ={"ABCD","AABB"};

        String[] keymap2 ={"AA"};
        String[] targets2 ={"B"};

        String[] keymap3 ={"AGZ", "BSSS"};
        String[] targets3 ={"ASA","BGZ"}; 

        One one = new One();
        System.out.println(Arrays.toString(one.solution(keymap2,targets2)));
    }

    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            String str = keymap[i];
            for (int j = 0; j < str.length(); j++) {
                if (!map.containsKey(str.charAt(j))) {
                    map.put(str.charAt(j), j + 1);
                } else {
                    map.put(str.charAt(j), map.get(str.charAt(j)) < j + 1 ? map.get(str.charAt(j)) : j + 1);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                if(map.containsKey(targets[i].charAt(j))) {
                    sum += map.get(targets[i].charAt(j));
                }else{
                    return answer= new int[]{-1};
                }

            }
                answer[i] = sum;
        }

        return answer;
    }
}
