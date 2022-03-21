package programmers.Level01;

import java.util.*;

public class Programmers_12906 {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);
        for(int n : arr){
            if(list.get(list.size()-1) != n)
                list.add(n);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    // 속도는 더빠름
    public int[] solution2(int []arr) {
        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);

        list.add(arr[0]);
        for(int n : arr){
            if(list.get(list.size()-1) != n)
                list.add(n);
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
