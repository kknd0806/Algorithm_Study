package programmers.Java.Level02;

public class Programmers_12911 {
    public int solution(int n) {
        String binary_n = Integer.toBinaryString(n);
        int num = countOfOne(binary_n);

        do {
            n++;
        } while(num != countOfOne(Integer.toBinaryString(n)));

        return n;
    }

    public int countOfOne(String s) {
        int num =0;
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i)=='1') {
                num++;
            }
        }
        return num;
    }

    // bitCount 사용한 알고리즘 풀이
    // bitCount = 숫자를 bit로 바꾸었을때 참(1)인 갯수

    public int soulution2(int n){
        int a = Integer.bitCount(n);
        do {
            n++;
        } while(Integer.bitCount(n) != a);
        return n;
    }
}
