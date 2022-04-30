package programmers.Java.Level02;

public class Programmers_12949 {
    public static void main(String[] args) {
        // 00 01
        // 10 11
        // 20 21

        /*
        a | a00 a01 |       | b00 b01 |     | a00 * b00 + a01 * b11    a00 * b01 + a01 * b11 |
          | a10 a11 |   x   | b10 b11 |  =  | a10 * b00 + a11 * b11    a10 * b01 + a11 * b11 |         
          | a20 a21 |                       | a20 * b00 + a21 * b11    a20 * b01 + a21 * b11 |

        */
        int[][] arr1 = {{1,4}, {3,2}, {4,1}};
        int[][] arr2 = {{3,3}, {3,3}};

        solution(arr1,arr2);

    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++)
            for (int j = 0; j < arr2[0].length; j++)
                for (int k = 0; k < arr1[0].length; k++)
                    answer[i][j] += (arr1[i][k] * arr2[k][j]);

        return answer;
    }
}
