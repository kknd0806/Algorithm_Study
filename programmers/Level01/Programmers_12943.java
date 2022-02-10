package programmers;

public class Programmers_12943 {
    public int solution (int num) {
        int answer = 0;
        long l_num = num;

        while(l_num != 1 && answer < 500){
            if(l_num % 2 == 0){
                l_num /= 2;
            } else {
                l_num = 3 * l_num + 1;
            }
            answer++;
        }

        return answer == 500 ? -1 : answer;
    }
}
