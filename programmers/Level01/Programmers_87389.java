package programmers.Level01;

public class Programmers_87389 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i < n; i++){
            if(n%i==1) {
                answer=i;
                break;
            }
        }
        return answer;
    }
}
