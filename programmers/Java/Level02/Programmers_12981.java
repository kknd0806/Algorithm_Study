package programmers.Java.Level02;

import java.util.*;

public class Programmers_12981 {
    public static void main(String[] args) {
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        solution(2, words);
    }
    public static int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        ArrayList<String> list = new ArrayList<String>();

        list.add(words[0]);
        for(int i = 1; i<words.length; i++) {
            // 끝말잇기가 틀리거나 list에 words[i]가 포함되어있는 경우
            if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0) || list.contains(words[i])){
                answer[0] = i % n + 1;
                answer[1] = (i + n) / n;
                return answer;
            }
            list.add(words[i]);
        }

        return answer;
    }
}
