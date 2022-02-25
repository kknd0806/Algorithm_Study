package programmers.Level01;

import java.util.*;
public class Programmers_42889 {
    public static void main(String[] args) {
        int[] stages = {2,1,2,6,2,4,3,3};
        solution(5,stages);
    }

    public static int[] solution(int N, int[] stages){
        int[] answer = new int[N];
        int user = stages.length;
        HashMap<Integer, Double> map = new HashMap<>();
        
        // map 초기화
        for(int i = 1; i<=N; i++){
            map.put(i, 0.0);
        }

        // 각 단계별 통과하지 못한 사람의 수
        for(int s : stages){
            if(s<=N){
                map.put(s, map.get(s) + 1);
            }
        }

        // 각 단계별 통과율
        for(int key : map.keySet()){
            double temp = map.get(key);
            map.put(key, temp / user);
            user -= temp;
            if(user==0) break;
        }

        // Map 정렬
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> (map.get(o1) - map.get(o2)) > 0.0 ? 1 : -1 );

        for(int i = 0; i<answer.length; i++){
            answer[i] = list.get(answer.length-(i+1));
        }

        return answer;
    }
}
