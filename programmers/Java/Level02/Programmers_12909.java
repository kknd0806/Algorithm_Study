package programmers.Java.Level02;

public class Programmers_12909 {
    boolean solution(String s) {
        int num = 0;
        for(int i = 0; i<s.length(); i++) {
            num += s.charAt(i) == '(' ? 1 : -1;
            if(num < 0)
                return false;
        }
        return num == 0;
    }
}
