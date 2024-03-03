package programmers.Java.Level01;

public class Programmers_68935 {
    public static void main(String[] args) {
        solution(125);
    }
    public static int solution(int n){
        String ternary = rev_conversion(n, 3);
        return conversion_ten(ternary, 3);
    }

    public static String rev_conversion(int num, int n){
        StringBuilder sb = new StringBuilder();
        int current = num;

        while(current > 0) {
            if(current % n < 10){
                sb.append(current % n);
            } else {
                sb.append((char)(current % n - 10 + 'A'));
            }
            current /= n;
        }
        return sb.toString();
    }

    public static int conversion_ten(String num, int n){
        char[] nums = num.toCharArray();
        int answer = 0;

        for(int i =0; i < nums.length; i++){
            if(nums[i] >= 'A'){
                answer = answer * n + (nums[i] - 'A' + 10);
            } else {
                answer = answer * n + (nums[i] - '0');
            }
        }
        return answer;
    }

    public int solution2(int n){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%3);
            n /= 3;
        }
        return Integer.parseInt(sb.toString(), 3);
    }
}
