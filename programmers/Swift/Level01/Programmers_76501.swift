import Foundation

func solution(_ absolutes:[Int], _ signs:[Bool]) -> Int {
    var answer = 0
    for i in 0..<absolutes.count {
        answer += signs[i] ? absolutes[i] : -absolutes[i]
    }
    
    return answer
}