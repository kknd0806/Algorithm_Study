package programmers.Java.Level01;

public class Programmers_12931 {
    public int solution(int n) {
        int answer = 0;
        String[] arr = Integer.toString(n).split("");
        for(String s : arr){
            answer += Integer.parseInt(s);
        }
        return answer;
    }

    public int solution_2(int n) {
        int answer = 0;
        while(n>0){
            answer += n%10;
            n /= 10;
        }
        return answer;
    }
}
