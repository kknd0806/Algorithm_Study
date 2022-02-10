package programmers;

public class Programmers_12944 {
    public static double solution(int[] arr){
        double answer = 0;
        for(int n : arr){
            answer += n;
        }
        return answer / arr.length;
    }
}
