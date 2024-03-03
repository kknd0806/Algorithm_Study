package programmers.Java.Level01;

public class Programmers_12934 {
    public long solution(long n){
        return Math.pow((int)Math.sqrt(n),2) == n ? (long)Math.pow((Math.sqrt(n)+1),2) : -1;
    }
}
