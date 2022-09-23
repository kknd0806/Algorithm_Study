package programmers.Java.Level02;

public class Programmers_70129 {
    public static void main(String[] args) {
        solution("110010101001");
        int a = 1;
    }

    private static int[] solution(String s) {
        int[] arr = new int[2];
        
        while(!s.equals("1")){
            arr[0] ++;
            arr[1] += s.length();
            s = s.replaceAll("0", "");
            arr[1] -= s.length();
            s = Integer.toBinaryString(s.length());
        }
        return arr;
    }
}

