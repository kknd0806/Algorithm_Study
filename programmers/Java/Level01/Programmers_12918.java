package programmers.Java.Level01;

public class Programmers_12918 {
    class Solution {
        public boolean solution(String s) {
            if(s.length()==4 || s.length()==6){
                for(int i = 0; i<s.length(); i++){
                    if(s.charAt(i) < '0' || s.charAt(i) > '9' || s.charAt(i) == ' '){
                        return false;         
                    }
                }
                return true;
            }
            return false;
        }
    }
}
