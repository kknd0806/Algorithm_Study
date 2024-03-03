package programmers.Java.Level01;

import java.util.*;

public class Programmers_12910 {
    //속도 빠름
    public int[] solution(int[] arr, int divisor) {
        int[] answer = divide(arr, divisor);
        if(answer.length == 0){
            return new int[] {-1};
        }
        return answer;
    }

    public int[] divide(int[] arr, int divisor){
        List<Integer> list = new ArrayList<>();
        for(int n : arr){
            if(n%divisor==0)
                list.add(n);
        }

        int[] result = new int[list.size()];
        for(int i = 0; i<list.size(); i++) {
            result[i] = list.get(i);
        }

        Arrays.sort(result);
        return result;
    }

    // 속도 오래걸림, 간결
    public int[] divisible(int[] arr, int divisor){
        int[] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).toArray();
        if(answer.length == 0) {
            return new int[] {-1};
        }

        Arrays.sort(answer);
        return answer;
    }
}
