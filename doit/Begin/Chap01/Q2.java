package doit.Begin.Chap01;

// 세 값의 최솟값을 구하는 min3 메서드
class Q2 {
    static int min3(int a, int b, int c) {
        return Math.min(a, Math.min(b,c));
    }
}
