package programmers.Level01;

import java.util.*;

public class Programmers_1845 {
    public int solution(int[] nums){
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
            if(set.size()>(nums.length/2)){
                answer = set.size()-1;
                break;
            }
            answer = set.size();
        }
        return answer;
    }
    
    public int solution2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }
        return set.size()>(nums.length/2) ? nums.length/2 : set.size();
    }
}
