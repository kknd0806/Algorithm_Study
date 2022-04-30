package programmers.Java.Level01;

import java.util.Map;
import java.util.HashMap;

public class Programmers_77484 {
    public static void main(String[] args) {
        int[] lottos = {44,1,0,0,31,25};
        int[] win_nums = {31,10,45,1,6,19};
        solution(lottos, win_nums);
    }
    public static int[] solution(int[] lottos, int[] win_nums){
        int[] answer = {0, 0};
        
        // 맞춘 숫자
        int match = 0;
        // 식별불가능한 숫자
        int unidentifiable = 0;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(0,0);

        for(int l : lottos) map.put(l, map.getOrDefault(l, 0)+1);            
        for(int w : win_nums) map.put(w,map.getOrDefault(w, 0)+1);

        unidentifiable = map.get(0);
        map.remove(0);

        for(int i : map.keySet()){
            if(map.get(i)==2) match ++;
        }
        
        answer[1] = 7 - match;
        answer[0] = answer[1] - unidentifiable;
        if(answer[1] > 6) answer[1] = 6;
        if(answer[0] > 6) answer[0] = 6;
        
        return answer;
    }
}
