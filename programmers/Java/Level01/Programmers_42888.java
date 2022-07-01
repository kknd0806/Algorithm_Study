package programmers.Java.Level01;

import java.util.*;

public class Programmers_42888 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        
        System.out.print(solution(record));
    }
    public static String[] solution(String[] record){
        List<String[]> list = new ArrayList<>();
        String temp[] = new String[3];
        Map<String, String> map = new HashMap<>();
        for(String s: record) {
            temp = s.split(" ");
            if (temp[0].equals("Enter")) {
                map.put(temp[1], temp[2]); 
                list.add(temp);
            } else if (temp[0].equals("Leave")){
                list.add(temp);
            } else {
                map.put(temp[1], temp[2]);
            }
        }

        String[] answer = new String[list.size()];

        for(int i = 0; i<list.size(); i++) {
            answer[i] = map.get(list.get(i)[1]) + "님이 ";
            if(list.get(i)[0].equals("Enter")) {
                answer[i] += "들어왔습니다.";
            } else {
                answer[i] += "나갔습니다.";
            }
        }

        return answer;
    }
}
