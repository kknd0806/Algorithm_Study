package programmers.Java.Level02;

import java.util.*;

public class Programmers_42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> pro_list = new ArrayList<Integer>();
        List<Integer> spe_list = new ArrayList<Integer>();
        List<Integer> arr = new ArrayList<>();
        for(int n: progresses) {
            pro_list.add(n);
        }
        for(int n: speeds) {
            spe_list.add(n);
        }

        int count = 0;    
        while(true) {
            for(int i = 0; i<pro_list.size(); i++) {
                pro_list.set(i, pro_list.get(i)+spe_list.get(i));
            }
            if(pro_list.get(0)>=100) {
                while(pro_list.size()!=0 && pro_list.get(0)>=100) {
                    pro_list.remove(0);
                    spe_list.remove(0);
                    count++;
                }
                arr.add(count);
                count = 0;
            }
            if (pro_list.size() == 0)
                break;
        }
        
        int[] answer = new int[arr.size()];

        for(int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
    public int[] solution2(int[] progresses, int[] speeds) {
        List<Integer> pro_list = new ArrayList<Integer>();
        List<Integer> spe_list = new ArrayList<Integer>();
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i<progresses.length; i++) {
            pro_list.add(progresses[i]);
            spe_list.add(speeds[i]);
        }

        int count = 0;
        int times = 0;
        while(true) {
            times = (int)Math.ceil((double)(100-pro_list.get(0)) / spe_list.get(0));
            System.err.println(times);
            for(int i = 0; i<pro_list.size(); i++) {
                pro_list.set(i, pro_list.get(i) + spe_list.get(i) * times);
            }
            while(pro_list.size()!=0 && pro_list.get(0)>=100) {
                pro_list.remove(0);
                spe_list.remove(0);
                count++;
            }
            arr.add(count);
            count = 0;

            if (pro_list.size() == 0)
                break;
        }
        
        int[] answer = new int[arr.size()];

        for(int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
    
}
