package programmers.Java.Level02;

import java.util.*;

public class Programmers_42885 {
    public static void main(String[] args) {
        int[] people = {70, 80, 50};
        solution(people,100);
    }
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);
        int cnt = 0;
        int min = 0;
        int max = people.length - 1;
        while(min <= max) {
            int temp = people[max] + people[min];
            if (temp > limit) {
                max --;
                cnt++;
            } else {
                min ++;
                max --;
                cnt ++;
            }
        }

        return cnt;
    }
}
