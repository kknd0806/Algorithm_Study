package programmers.Level01;

import java.util.*;

public class Programmers_68644 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        solution(numbers);
    }
    public static int[] solution(int[] numbers){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<numbers.length-1; i++){
            for(int j = i+1; j<numbers.length; j++){
                if(list.indexOf(numbers[i]+numbers[j])==-1){
                    list.add(numbers[i]+numbers[j]);
                }
            }
        }

        list.sort(Comparator.naturalOrder());
        
        int[] answer = new int[list.size()];

        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
