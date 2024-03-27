package org.example.B240327;

/*
    백준 1924번 문제 : 2007년

    https://www.acmicpc.net/problem/1924
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class year2007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        // 날짜 형식 반환 2007-01-01
        LocalDate date = LocalDate.of(2007,Integer.parseInt(str[0]),Integer.parseInt(str[1]));

        // DayOfWeek 객체 구하기
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        // 숫자 요일 구하기 (1부터 월요일 ~ 7:일요일)
        int datOfWeekNumber = dayOfWeek.getValue();

        System.out.println((dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US)).toUpperCase());
    }
}
