package programmers.Java.Level01;

import java.util.*;

public class Programmers_12915 {
    public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i<strings.length; i++){
            list.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list);

        for(int i = 0; i<strings.length; i++){
            strings[i] = list.get(i).substring(1);
        }

        return strings;
    }
}
