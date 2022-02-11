package programmers.Level01;

import java.util.Arrays;

public class Programmers_12982 {
    public int solution(int[] d, int budget){
        int answer = 0;
        Arrays.sort(d);
        int index = 0;
        while(budget < 0){
            budget -= d[index];
            index++;
            answer++;
        }
        answer--;

        return answer;
    }
}
