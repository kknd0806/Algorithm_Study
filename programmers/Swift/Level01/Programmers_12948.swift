final class Programmers_12948 {
    func solution(_ phone_number:String) -> String {
        var result = String(repeating: "*", count: phone_number.count-4)
        result += phone_number.suffix(4)
        
        return result
    }
}