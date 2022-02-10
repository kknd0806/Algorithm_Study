package programmers.Level02;

import java.util.ArrayList;
import java.util.List;

public class Programmers_12945 {
    public static void main(String[] args) {
        System.out.println(solution(100000));
    }

    public static int solution(int n) {
        List<Integer> num = new ArrayList<Integer>();
        num.add(0);
        num.add(1);

        for(int i = 2; i < n + 1; i++){
            num.add(remainder(num.get(i - 2))+remainder(num.get(i - 1)));
        }
        return remainder(num.get(n));
    }

    public static int remainder (int n){
        return n % 1234567;
    }
}
