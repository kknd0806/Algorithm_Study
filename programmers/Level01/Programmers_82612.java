package programmers.Level01;

public class Programmers_82612 {
    public long solution(int price, int money, int count){
        long answer = money;
        for(int i = 0 ; i<count; i++) {
            answer -= (i+1) * price;
        }
        return answer < 0 ? -answer : 0;
    }

    public long solution2(int price, int money, int count){
        return Math.max((long)price * ( count * (count + 1) / 2) - money, 0);
    }
}
