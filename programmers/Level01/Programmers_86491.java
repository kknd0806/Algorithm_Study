package programmers.Level01;

import java.util.Arrays;

public class Programmers_86491 {
    public static void main(String[] args) {
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        solution(sizes);
    }
    public static int solution(int[][] sizes){
        int answer = 0;
        for(int[] i : sizes){
            Arrays.sort(i);
            System.out.println(i[0] + ", " + i[1] );
        }

        return answer;
    }
}
