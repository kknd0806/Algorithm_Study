package programmers.Level01;

public class Programmers_17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] BinaryString1 = new String[n];
        String[] BinaryString2 = new String[n];
        String[] answer = new String[n];
        
        for(int i = 0; i<n; i++) {
            BinaryString1[i] = toBinaryNum(arr1[i], n);
            BinaryString2[i] = toBinaryNum(arr2[i], n);
        }

        for(int i = 0; i<n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < BinaryString1[i].length(); j++) {
                if(BinaryString1[i].charAt(j) == '1' || BinaryString2[i].charAt(j) == '1'){
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        
        return answer;
    }

    public String toBinaryNum(int num, int n){
        String BinaryNum = Integer.toBinaryString(num);
        while(BinaryNum.length()!=n){
            BinaryNum = "0" + BinaryNum;
        }
        return BinaryNum;
    }
}
