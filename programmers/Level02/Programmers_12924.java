package programmers.Level02;

public class Programmers_12924 {
    public static void main(String[] args) {
        System.out.println(solution(15));

    }
    public static int solution(int n) {      
        class Solution {
            public int solution(int n) {
                int answer =0;
        
                for(int i=1;i<=n;i++){
                    int inum=i;
                    int add =0;
                    while (true){
                        add+=inum;
        
                        if(add==n){
                            answer++;
                            break;
                        }else if(add>n){
                            break;
                        }
                        inum++;
                    }
                }
                return answer;
            }
        }
        
    }
}
