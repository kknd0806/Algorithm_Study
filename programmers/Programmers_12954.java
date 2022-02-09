package programmers;

class Programmers_12954 {
    public static void main(String[] args) {
        System.out.println(solution(2, 5));
        System.out.println(solution(4, 3));
        System.out.println(solution(-4, 2));
    }

    public static long[] solution(long x, int n){
        long[] answer = new long[n];
        for(int i = 0; i < n; i++){
            answer[i] = x * (i + 1);
        }
        return answer;
    }
}
