package programmers.Level01;

import java.util.Arrays;

public class Programmers_12982 {
    public int solution(int[] d, int budget){
        int answer = 0;
        Arrays.sort(d);
        for(int n : d){
            budget -= n;
            if(budget<0) break;
            answer ++;
        }

        return answer;
    }
}
