package programmers.Level02;

import java.util.Arrays;

public class Programmers_12941 {
    public int solution(int []A, int[]B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;
        for(int i = 0; i<A.length; i++) {
            answer += A[i] * B[A.length-1-i];
        }
        return answer;
    }
}
