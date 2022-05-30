import Foundation
func solution(_ n:Int) -> Int {
    var answer = 0
    var primes: [Bool] = Array.init(repeating: false, count: n+1)
    
    for i in 2...n {
        if !primes[i] {
            answer = answer + 1
        }
        for j in 1...(n/i) {
            primes[i*j] = true
        }
    }
    return answer
}