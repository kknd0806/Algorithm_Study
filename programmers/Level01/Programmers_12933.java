package programmers.Level01;

import java.util.Arrays;

public class Programmers_12933 {
    public long solution(long n) {
        long answer = 0;

        String[] s = Long.toString(n).split("");
        Arrays.sort(s);
        
        for(int i = s.length-1 ; i >= 0; i--){
            answer = answer * 10 + Integer.parseInt(s[i]);
        }

        return answer;
    }
}
