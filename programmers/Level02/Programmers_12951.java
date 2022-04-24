package programmers.Level02;

public class Programmers_12951 {
    public static void main(String[] args) {
        System.out.println("for the last week");
        System.out.println((char)('a'-32));
    }
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();


        if(isUpeer(s.charAt(0))){
            sb.append(s.substring(0,1).toUpperCase());
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

    public String solution2(String s) {
        String[] arr = s.toLowerCase().split("");
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;

        for(String a: arr) {
            sb.append( isFirst ? a.toUpperCase() : a );
            isFirst = a.equals(" ");
        }

        return sb.toString();
    }
}
