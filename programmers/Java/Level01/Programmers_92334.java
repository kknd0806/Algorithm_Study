package programmers.Java.Level01;

import java.util.*;

public class Programmers_92334 {

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};

        solution(id_list, report, 2);
    }
    public static int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> map = new HashMap<>();
        HashMap<String, Integer> answer = new HashMap<>();        
        
        for(String id : id_list){
            map.put(id, new HashSet<>());
            answer.put(id, 0);
        }

        for(String temp : report){
            String[] str = temp.split(" ");
            map.get(str[1]).add(str[0]);
        }

        for(String key : map.keySet()){
            HashSet<String> reporters = map.get(key);
            if(reporters.size() > k){
                for(String reporter : reporters){
                    answer.put(reporter, answer.get(reporter) + 1);
                }
            }
        }

        return answer.values().stream().mapToInt(i -> i).toArray();
    }    
}
