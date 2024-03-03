final class Programmers_70128  {
    func solution(_ a:[Int], _ b:[Int]) -> Int {
        var answer = 0
        for i in 0..<a.count {
            answer += a[i] * b[i]
        }
        return answer
    }
}