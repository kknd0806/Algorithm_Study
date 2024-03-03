package programmers.Java.Level02;

public class Programmers_12913 {
    // 동적 계획법 알고리즘 (Dynamic Programming, DP)
    /*
        동적 계획법이란 이미 했던 연산들이 반복될 때, 이전 연산을 기록해두고,
        이미 기록했던 값은 다시 연산이 아닌 기록되어 있는 값을 가져오는 방식의 알고리즘 방식
    */
    public int solution(int[][] land) {
        // land에 나열된 값은 이전 행의 가장 높은 값과 더하면서 진행이 된다.
        for(int i = 1; i<land.length; i++) {
            land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3]));
            land[i][3] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));
        }

        int answer = 0;
        for(int m : land[land.length-1]) {
            answer = Math.max(answer, m);
        }

        return answer;
    }
}
