package doit.Begin.Chap01;

// 네 값의 최솟값을 구하는 min4 메서드
public class Q3 {
    static int min4(int a, int b, int c, int d) {
        int row = compareRow(a, b);
        row = compareRow(row, c);
        row = compareRow(row, d);
        return row;
    }

    private static int compareRow(int a, int b) {
        return a < b ? a : b;
    }
    
}
