package programmers.Level01;

public class Programmers_12901 {
    public String solution(int a, int b){
        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] month = {0,31,29,31,30,31,30,31,31,30,31,30};
        int date = b;
        for(int i = 0; i<a; i++){
            date += month[i];
        }
        return day[date%7];
    }
}
