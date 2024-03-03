final class Programmers_12954 {
    func solution(_ x:Int, _ n:Int) -> [Int64] {
        var arr: [Int64] = []
        for i in 1...n {
            arr.append(Int64(x*i))
        }
        return arr
    }

    func solution2(_ x:Int, _ n:Int) -> [Int64] {
        return Array(1...n).map{ Int64($0 * x)}
    }
}