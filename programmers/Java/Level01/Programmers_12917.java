package programmers.Java.Level01;

import java.util.Arrays;
import java.util.Collections;

public class Programmers_12917 {
    public String solution(String s) {
        String[] arr = s.split("");

        Arrays.sort(arr,Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for(String c : arr) {
            sb.append(c);
        }

        return sb.toString();
    }
}
