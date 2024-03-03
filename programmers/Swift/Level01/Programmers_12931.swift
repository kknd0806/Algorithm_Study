final class Programmers_12931 {
    func solution(_ n:Int) -> Int {
        var num = n
        var answer = 0
        while num > 0 {
            answer += num % 10
            num /= 10
        }
        return answer
    }
}