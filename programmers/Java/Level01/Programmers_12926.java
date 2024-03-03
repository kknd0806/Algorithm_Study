package programmers.Java.Level01;


public class Programmers_12926 {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                c = floorChar(c, 'z', n);
                sb.append(c);
            } else if (c>='A' && c<='Z'){
                c = floorChar(c, 'Z', n);
                sb.append(c);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    private char floorChar(char target, char compare, int n) {
                int result = target + n;
        return result<=compare? (char)result : (char)(result-26);
        
    }
}