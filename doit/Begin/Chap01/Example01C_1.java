package doit.Begin.Chap01;

import java.util.Arrays;
import java.util.Scanner;

// 3개의 정숫값을 입력하고 중앙값을 구하여 출력
class Example01C_1 {
    // 책 문제풀이
    static int med3(int a, int b, int c) {
        if(a >= b) 
            if(b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else 
            return b;
    }

    // Array를 이용한 문제풀이
    static int med3_2(int a, int b, int c) {
        int[] arr = {a,b,c};
        Arrays.sort(arr);

        return arr[1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a의 값 : ");
        int a = sc.nextInt();
        System.out.print("b의 값 : ");
        int b = sc.nextInt();
        System.out.print("c의 값 : ");
        int c = sc.nextInt();
        
        System.out.println("중앙값은 " + med3(a,b,c) + "입니다.");
        sc.close();
    }
}
