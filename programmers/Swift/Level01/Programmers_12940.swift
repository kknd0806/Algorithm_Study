final class Programmers_12940 {
    func solution(_ n:Int, _ m:Int) -> [Int] {
        let min = gcd(n, m)
        let answer = [min, m * n / min]
        return answer
    }

    func gcd(_ n:Int, _ m:Int) -> Int {
        return n % m == 0 ? m : gcd(m, n%m)
    }
}