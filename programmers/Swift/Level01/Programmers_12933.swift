class Programmers_12933 {
    func solution(_ n:Int64) -> Int64 {
        let array = String(n).map{String($0)}.sorted{$0>$1}
        var answer = String()
        array.map{
            answer += $0
        }
        return Int64(answer)!
    }
}
