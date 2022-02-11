package programmers.Level01;

import java.util.ArrayList;
import java.util.List;

public class Programmers_42840 {
    public int[] solution(int[] answers){
        int[][] student = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};
        int[] temp = new int[3];
        for(int i = 0; i<answers.length; i++){
            if(student[0][i%student[0].length]==answers[i]) temp[0]++;
            if(student[1][i%student[1].length]==answers[i]) temp[1]++;
            if(student[2][i%student[2].length]==answers[i]) temp[2]++;
        }

        List<Integer> list = new ArrayList<Integer>();
        int max = Math.max(Math.max(temp[0], temp[1]),temp[2]);

        for(int i = 0; i<3; i++){
            if(temp[i]==max){
                list.add(i+1);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
