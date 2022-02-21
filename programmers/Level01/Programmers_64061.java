package programmers.Level01;

import java.util.Stack;

public class Programmers_64061 {
    public static void main(String[] args) {
        int[][] board = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        int[] moves = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5};
        System.out.println(solution(board, moves));
        
    }
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int move : moves){
            for(int i = 0; i<board.length; i++){
                if(board[i][move-1]!=0){
                    if(stack.isEmpty() || stack.peek() != board[i][move-1]){
                        stack.push(board[i][move-1]);
                    } else {
                        stack.pop();
                        answer+=2;
                    }
                    board[i][move-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
