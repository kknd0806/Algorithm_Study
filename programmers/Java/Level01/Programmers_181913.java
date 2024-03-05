package programmers.Java.Level01;

public class Programmers_181913 {
    public static void main(String[] args) {
        String myString = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        System.out.println(solution(myString, queries));
    }

    public static String solution(String my_string, int[][] queries) {
        StringBuilder modified = new StringBuilder(my_string);
        
        for(int[] query: queries) {
            String substringToReverse = modified.substring(query[0], query[1] + 1);
            modified.replace(query[0], query[1] + 1, new StringBuilder(substringToReverse).reverse().toString());
        }
        
        return modified.toString();
    }
}