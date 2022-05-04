final class Programmers_12935 {
    func solution(_ arr:[Int]) -> [Int] {
        if arr.count == 1 {
            return [-1]
        }
        let min = arr.sorted(by: <)[0]
        var answer: [Int] = []
        arr.map {
        if $0 != min {
            answer.append($0)
        } 
        }
        return answer
    }
}