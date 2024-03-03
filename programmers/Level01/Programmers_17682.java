package programmers.Level01;


public class Programmers_17682 {
    public static void main(String[] args) {
        solution("1D2S#10S");
    }

    public static int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];

        for(int i = 0, j = 0; i<dartResult.length(); i++){
            switch (dartResult.charAt(i)){
                case '0': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
                score[j] =Integer.parseInt(dartResult.substring(i, i+1)); 
                j++;
                break;
                case '1':
                if(dartResult.charAt(i+1)=='0') {
                    score[j] = 10;
                    j++;
                    i++;
                } else {
                    score[j] = 1;
                    j++;
                }

                case 'S' : score[j-1] = pow(score[j-1], 1); break;
                case 'D' : score[j-1] = pow(score[j-1], 2); break;
                case 'T' : score[j-1] = pow(score[j-1], 3); break;
                case '*' : 
                score[j-1] = score[j-1] * 2;
                if(j!=0)
                score[j-2] = score[j-2] * 2;
                break;
                case '#' :
                score[j-1] = score[j-1] * 4;
                if(j!=0)
                score[j-2] = score[j-2] * 4;
                break;
            }
        }

        for(int i : score){
            answer += i;
        }

        System.out.println(answer);
        return answer;
    }

    private static int pow(int num, int time) {
        int pow = num;
        for(int i = 0; i < time - 1; i++){
            pow *= num;
        }

        return pow;
    }
}
