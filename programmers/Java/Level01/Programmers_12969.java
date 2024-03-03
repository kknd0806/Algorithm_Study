package programmers.Java.Level01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Programmers_12969 {
    public static void main(String[] args) {
        try {
            // 실수 입력
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            // 실수 저장
            // s[0] : 가로
            // s[1] : 세로
            String[] s = br.readLine().split(" ");
            
            for(int i = 0; i < Integer.parseInt(s[1]); i++){
                for(int j = 0; j < Integer.parseInt(s[0]); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
