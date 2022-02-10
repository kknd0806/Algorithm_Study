package programmers;

public class Programmers_12948 {
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution("0277788888"));
    }

    public static String solution (String phone_number){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<phone_number.length()-4; i++){
            sb.append("*");
        }
        sb.append(phone_number.substring(phone_number.length()-4, phone_number.length()));

        return sb.toString();
    }
}
