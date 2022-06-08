package doit.Begin.Chap01;

import java.util.Scanner;


// 3개의 정숫값을 입력하고 최댓값을 구하여 출력
class Example01_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a 의 값 : ");
        int a = sc.nextInt();
        System.out.print("b 의 값 : ");
        int b = sc.nextInt();
        System.out.print("c 의 값 : ");
        int c = sc.nextInt();
        
        // method 1
        int max = a;
        if(b>max) max = b;
        if(c>max) max = c;

        System.out.println("최댓값은 " + max + "입니다.");

        // method 2
        System.out.println("최댓값은 " + Math.max(a,Math.max(b,c)) + "입니다.");
        sc.close();
    }
}
