package programmers.Java.Level02;


public class Programmers_42842 {
    public static void main(String[] args) {
        solution(10, 2);
    }
    public static int[] solution(int brown, int yellow) {
        int k = (brown - 4) / 2;
        int[] result = new int[2];

        for(int i = 1; i < k ; i++ ){
            System.out.println(i);
            if (i * (k-i) == yellow) {
                result[0] = k-i + 2;
                result[1] = i + 2;
                break;
            }
        }
        return result;
    }
}
