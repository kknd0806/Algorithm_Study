import Foundation

final class Programmers_12934 {
    func solution(_ n:Int64) -> Int64 {
        let temp = Int64(sqrt(Double(n)))
        return temp * temp == n ? (temp+1)*(temp+1) : -1
    }
}