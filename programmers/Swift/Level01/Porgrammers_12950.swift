final class Programmers_12950 {
    func solution(_ arr1:[[Int]], _ arr2:[[Int]]) -> [[Int]] {
        var arr: [[Int]] = .init(repeating: .init(repeating: 0, count: arr1.first!.count), count: arr1.count)
        for i in 0..<arr1.count {
            for j in 0..<arr1[0].count {
                arr[i][j] = (arr1[i][j] + arr2[i][j])
            }
        }
        return arr
    }
}