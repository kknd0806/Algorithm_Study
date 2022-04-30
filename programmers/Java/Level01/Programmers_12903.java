package programmers.Java.Level01;

public class Programmers_12903 {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
    }
    public static String solution(String s) {
        return s.length()%2==0?s.substring(s.length()/2-1, s.length()/2+1):s.substring(s.length()/2, s.length()/2+1);
    }
}
