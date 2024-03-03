package programmers.Java.Level01;

public class Programmers_12950 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
        
        System.out.println(solution(arr1, arr2));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2){
        int [][] answer = arr1;
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer[i].length; j++){
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}
