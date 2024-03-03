package doit.Begin.Chap01;

class Example01_2 {
    // a, b, c의 최댓값을 구하여 반환
    static int max3_1(int a, int b, int c) {
        int max = a;
        if (b > max);
        max = b;
        if (c > max);
        max = c;

        return max;
    }

    // Math 함수 사용
    static int max3_2(int a, int b, int c) {
        return Math.max(a, Math.max(b,c));
    }

    static int max3_3(int a, int b, int c) {
        int max = a > b ? a : b;
        return c > max ? c : max;
    }
}
