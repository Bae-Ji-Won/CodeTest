package org.example.B240328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

/*
    백준 7785번 문제 : 회사에 있는 사람

    https://www.acmicpc.net/problem/7785

    처음에는 Arraylist를 통해서 add로 데이터를 넣고 remove를 통해서 제거하는 방식으로 했는데 remove는 시간복잡도 O(N)이므로 계속 시간초과가 발생했다.
    따라서 HashMap을 통해 구현하였다.
 */
public class person_in_the_company {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        Map<String,String> nameMap = new HashMap<>();

        for(int i=0; i<count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            nameMap.put(st.nextToken(), st.nextToken());
        }

        Stream<String> name = nameMap.keySet().stream();
        name.sorted(Collections.reverseOrder()).filter(i -> nameMap.get(i).equals("enter")).forEach(System.out::println);
    }
}

