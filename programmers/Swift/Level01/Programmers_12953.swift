class Programmers_12953 {
    func solution(_ arr:[Int]) -> Double {
        var sum = 0
        arr.map {
            sum += $0
        }
        return Double(sum) / Double(arr.count)
    }   
}
