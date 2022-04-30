package programmers.Java.Level02;

public class Programmers_12953 {
    // 유클리드 호재법 이용
    public int solution(int[] arr) {
        int answer = arr[0];

        for(int i = 1; i<arr.length; i++) {
            answer = answer * arr[i] / gcd(answer, arr[i]);
        }

        return answer;
    }
    
     public int gcd(int n, int m) {
        return n % m == 0 ? m : gcd(m, n % m);
     }
}
