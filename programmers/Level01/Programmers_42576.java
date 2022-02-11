package programmers.Level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Programmers_42576 {
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        solution2(participant, completion);
    }
    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i =0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }

    // 효율성 시간초과
    public static String solution2(String[] participant, String[] completion) {
        List<String> list = new ArrayList<>();
        
        for(String s : completion){
            list.add(s);
        }

        for(String s : participant){
            if(list.indexOf(s)==-1){
                return s;
            } else {
                list.remove(list.indexOf(s));
            }
        }
        return list.get(0);
    }

    // 다른사람 풀이 HashMap을 이용한 풀이
    // 참가자가 중복된 이름(key)을 가지면 Value에 1추가
    // 완주자 이름(key)이 HashMap에 존재하면 Value에서 1을 뺀다.
    // 완주한 자의 이름(key)의 값(value)는 0이 된다.
    // 반대로 완주하지 못한 자의 값은 0이 아니다.
    public String solution3(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
