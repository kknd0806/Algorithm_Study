package doit.Begin.Chap01;

// 네 값의 최댓값을 구하는 max4 메서드를 작성
class Q1 {
    public static void main(String[] args) {
        System.out.println(max4(5, 6, 1, 9));
    }
    static int max4(int a, int b, int c, int d) {
        int max = compareUpper(a, b);
        max = compareUpper(c, max);
        max = compareUpper(d, max);
        return max;
    }

    private static int compareUpper(int a, int b){
        return a > b ? a : b;
    }
}
