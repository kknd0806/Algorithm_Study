package programmers.Java.Level01;

public class Programmers_12921 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
    public static int solution (int n) {
        int answer = 0;
        // 에라토스테네스의 체 : 2부터 시작하여 소수의 배수를 모두 걸러준다.
        boolean[] primes = new boolean[n];
        
        for(int i = 2; i <= n; i++){
            if(primes[i - 1]) continue;    
            for(int j = i ; j <= n; j += i){
                primes[j - 1] = true;
            }
            answer++;
        }

        return answer;
    }
}
