package programmers.Level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Programmers_86051 {

    public int solution(int[] numbers){
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        for(int num : numbers) {
        	list.add(num);
        }
        for(int i = 0; i<10; i++) {
        	if(list.indexOf(i)==-1) {
        		answer+=i;
        	}
        }
        return answer;
    }

    // 짧은데 오래걸림
    public int solution2(int[] numbers) {
        int answer = 0;
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList()); 
        for(int i = 1; i<10; i++){
            if(list.indexOf(i)<0){
                answer += i;
            }
        }

        return answer;
    }

    // 프로그래머스 정답 중 하나
    public int solution3(int[] numbers){
        int answer = 45;
        for(int n : numbers){
            answer -= n;
        }
        return answer;
    }
}
