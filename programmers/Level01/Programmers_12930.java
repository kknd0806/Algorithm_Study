package programmers.Level01;

public class Programmers_12930 {
    public String solution(String s){
        String[] arr = s.split("");
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (String ss : arr){
            index = ss.equals(" ") ? 0 : index+1;
            sb.append(index % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase());
        }

        return sb.toString();
    }
}
