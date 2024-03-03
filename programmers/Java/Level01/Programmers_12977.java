package programmers.Java.Level01;

public class Programmers_12977 {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        for(int i = 0; i<nums.length-2; i++){
            for(int j = i+1; j<nums.length-1; j++){
                for(int z = j+1; z<nums.length; z++){
                    sum = nums[i] + nums[j] + nums[z];
                    if(is_prime(sum)){
                        answer++;
                    }
                    
                }
            }
        }    
        return answer;
    }
    
    public boolean is_prime(int number){
        boolean answer = true;
        for(int i=2; i<number; i++){
            if(number % i == 0){
                answer = false;
            }
        }
        return answer;
    }
}
