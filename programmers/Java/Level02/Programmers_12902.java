package programmers.Java.Level02;

public class Programmers_12902 {
    public static void main(String[] args) {
        System.out.println(solution(8));
    }
    /*
     * f(2) == 3
     * f(4) == 11
     * f(6) == 41
     * f(8) == 153
     * n은 홀수가 아닐 때
     * f(n) + f(n+4) == 4 * f(n+2)
     * f(n) == 4 * (n-2) - f(n) 
     */
    // 동적 계획법 (DP)
    public static int solution(int n) {
        int mod = 1000000007;
        int[] dp = new int[n+1];

        dp[1] = 2;
        dp[2] = 3;
        
        for(int i = 3; i <= n; i++){
            if(i%2 == 0){
                //짝수
                dp[i] = dp[i-1]%mod + dp[i-2]%mod;
            } else {
                // 홀수
                dp[i] = dp[i-1]*2%mod + dp[i-2]%mod;
            }
            dp[i] = dp[i]%mod;
        }
        
        return dp[n];
    }
}
