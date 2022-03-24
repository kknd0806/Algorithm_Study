package programmers.Level01;

public class Programmers_12932 {
    public int[] solution(long n) {
        String s = Long.toString(n);
        
        int[] answer = new int[s.length()];

        for(int i = 0; i<answer.length; i++){
            answer[i] = s.charAt(s.length()-1-i);
        }

        return answer;
    }    
}
