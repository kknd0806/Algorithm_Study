package programmers.Level01;

public class Programmers_42862 {
    public static void main(String[] args) {
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        solution(5, lost, reserve);
    }
    public static int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n];
        // 잃어버린 학생
        for(int l : lost){
            student[l-1]--;
        }
        // 여분 학생
        for(int r : reserve) {
            student[r-1]++;
        }
        // 여분 분배
        for(int i = 0 ; i<n; i++) {
            if(student[i]==1) {
                if( i>0 && student[i-1]==-1) {
                    student[i-1]++;
                    student[i]--;
                } else if ( i < n-1 && student[i+1]==-1) {
                    student[i+1]++;
                    student[i]--;
                }
            }
        }
        // 카운트
        for(int num : student){
            if(num==-1) n--;
        }
        return n;
    }
}
