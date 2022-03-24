package programmers.Level01;

public class Programmers_12912 {
    public long solution(int a, int b) {
        long high_num = Math.max(a,b);
        long low_num = Math.min(a,b);
        
        return (high_num - low_num + 1) * (high_num + low_num) / 2;
    }
}
