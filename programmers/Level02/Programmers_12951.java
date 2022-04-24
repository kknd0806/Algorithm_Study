package programmers.Level02;

public class Programmers_12951 {
    public static void main(String[] args) {
        System.out.println("for the last week");
        System.out.println((char)('a'-32));
    }
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        if(isUpeer(s.charAt(0))){
            sb.append(s.charAt(0)-32);
        } else {
            sb.append(s.charAt(0));
        }
        for(int i = 1; i<s.length(); i++) {
            if(s.charAt(i-1)== ' ') {
                sb.append(s.substring(i, i+1).toUpperCase());
            } else {
                sb.append(s.substring(i, i+1).toLowerCase());
            }
            
        }
        return sb.toString();
    }
    public static Boolean isUpeer(char c) {
        return c>='a' && c<='z' ? true : false;
    }
}
