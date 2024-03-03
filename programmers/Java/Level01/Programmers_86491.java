package programmers.Java.Level01;

import java.util.Arrays;

public class Programmers_86491 {
    public static void main(String[] args) {
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        solution(sizes);
    }
    public static int solution(int[][] sizes){
        int height = 0;
        int width = 0;
        for(int[] i : sizes){
            Arrays.sort(i);
            if(height<i[0]) height=i[0];
            if(width<i[1]) width=i[1];
        }

        return height * width;
    }
    public static int solution2(int[][] sizes){
        int height = 0;
        int width = 0;
        for(int[] i : sizes){
            if(height<Math.max(i[0],i[1])) height=Math.max(i[0],i[1]);
            if(width<Math.min(i[0],i[1])) width=Math.min(i[0],i[1]);
        }

        return height * width;
    }
}
