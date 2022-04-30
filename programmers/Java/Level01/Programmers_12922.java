package programmers.Java.Level01;

public class Programmers_12922 {
    class Solution {
        public String solution(int n) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<n/2; i++){
                sb.append("수박");
            }
            if(n%2==1) sb.append("수");
            return sb.toString();
        }
    }
}
