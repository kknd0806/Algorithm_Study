package programmers.Level02;

public class Programmers_12939 {
    public String solution(String s) { 
        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);

        for(String num : arr) {
            min = Integer.min(min, Integer.parseInt(num));
            max = Integer.max(max, Integer.parseInt(num));
        }

        String answer = min + " " + max;

        return answer;
    }
}
