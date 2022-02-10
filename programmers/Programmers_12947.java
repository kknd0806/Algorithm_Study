package programmers;

public class Programmers_12947 {
    public static void main(String[] args) {
        System.out.println(solution(12));
    }
    
    public static boolean solution (int x) {
        boolean result = true;
        int sum = 0;
        String[] s = Integer.toString(x).split("");
        for(String i : s){
            sum += Integer.parseInt(i);
        }
        if( x % sum != 0){
            result = false;
        }
        return result;
    }
}
