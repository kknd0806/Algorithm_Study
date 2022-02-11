package programmers.Level01;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class Programmers_12901 {
    public static void main(String[] args) {
        System.out.println(solution(5, 24));
        System.out.println(getDatName(5, 24));
        System.out.println(solution2(5, 24));
    }

    public static String solution(int a, int b){
        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] month = {0,31,29,31,30,31,30,31,31,30,31,30};
        int date = b;
        for(int i = 0; i<a; i++){
            date += month[i];
        }
        return day[date%7];
    }

    // 프로그래머스 추가 답
    public static String getDatName(int month, int day) {
        Calendar cal = new Calendar.Builder().setCalendarType("iso8601").setDate(2016, month-1, day).build();
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
    }

    // 추가답 2
    public static String solution2(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
    }
}
