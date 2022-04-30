package programmers.Java.Level01;

import java.util.Arrays;

public class Programmers_12919 {
    public String solution (String[] seoul) {
        int i = 0;
        while(!seoul[i].equals("Kim")){
            i++;
        }
        return "김서방은 " + i + "에 있다";
    }

    public String solution2 (String[] seoul) {
        int index = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + index + "에 있다";
    }
}
