package programmers.Level01;

public class Programmers_77884 {
    public static void main(String[] args) {
        solution(13,17);
    }
    public static int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i<=right; i++){
            int temp = 0;
            for(int j = 1 ; j<=Math.sqrt(i); j++){
                if(i % j == 0){
                    temp++;
                    if(i/j != j){
                        temp++;
                    }
                }
            }
            answer += temp%2==0?i:-i;
        }
        
        System.out.println(answer);
        return answer;
    }
}
