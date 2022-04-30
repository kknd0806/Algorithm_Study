package programmers.Java.Level01;

import java.util.Arrays;

public class Programmers_12935 {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[arr.length-1];
        int[] temp = arr.clone();
        Arrays.sort(temp);

        for(int i = 0,  j = 0; i<arr.length; i++){
            if(arr[i]!=temp[0]){
                answer[j] = arr[i];
                j++;
            }
        }

        return answer;
    }
}
