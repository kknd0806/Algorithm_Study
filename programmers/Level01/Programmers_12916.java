package programmers.Level01;

public class Programmers_12916 {
    public boolean solution(String s) {
        String[] ss = s.split("");
        int p = 0;
        int y = 0;
        for(String c : ss){
            if(c.equals("P") || c.equals("p")) p++;
            else if(c.equals("y") || c.equals("y")) p++;
        }
        
        return p==y;
    }
}
