package programmers.Java.Level02;

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

    // Integer.parseInt가 생각보다 시간을 많이 잡아먹는듯
    public String solution2(String s) {
        String[] arr = s.split(" ");
        int min, max, n;
        min = max = Integer.parseInt(arr[0]);

        for(String num : arr) {
            n = Integer.parseInt(num);
            min = Integer.min(min, n);
            max = Integer.max(max, n);
        }

        String answer = min + " " + max;

        return answer;
    }
}
