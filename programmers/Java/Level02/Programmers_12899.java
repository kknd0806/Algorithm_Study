package programmers.Java.Level02;

public class Programmers_12899 {
    public static void main(String[] args) {
        solution(4);
    }
    public static String solution(int n) {
        String[] num = {"4","1","2"};
        String answer = "";

        while(n > 0){
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }    
}
