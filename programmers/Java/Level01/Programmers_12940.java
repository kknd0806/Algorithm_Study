package programmers.Java.Level01;

import java.util.*;

public class Programmers_12940 {
     // 방법 1 : 약수 계산 후 최대공약수 및 최소공배수 계산
   public int[] solution(int n, int m) {
    ArrayList<Integer> n_list = divisor(n);
    ArrayList<Integer> m_list = divisor(m);

    //
    int min_divisor = 1;

    for (int i = n_list.size() - 1; i >= 0; i--) {
       if (m_list.indexOf(n_list.get(i)) != -1) {
          min_divisor = n_list.get(i);
          break;
       }
    }

    int[] answer = { min_divisor, n * m / min_divisor };
    return answer;
 }

 public ArrayList<Integer> divisor(int num) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 2; i < Math.sqrt(num); i++) {
       if (num % i == 0) {
          list.add(i);
          if (num / i != i) {
             list.add(num / i);
          }
       }
    }
    list.add(1);
    list.add(num);
    Collections.sort(list);
    return list;
 }

 // 방법 2 : 유클리드 호재법
 public int[] solution2(int n, int m) {
    int min_divisor = gcd(n, m);
    int[] answer = { min_divisor, m * n / min_divisor };
    return answer;
 }

 public int gcd(int n, int m) {
    return n % m == 0 ? m : gcd(m, n % m);
 }
}
