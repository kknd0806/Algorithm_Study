package programmers.Java.Level01;

public class Programmers_72410 {
    public String solution(String new_id){
        String answer = "";
		// 1단계
        answer = first_step(new_id);

		// 2단계
		answer = second_step(answer);

		// 3단계
        answer = third_step(answer);

		// 4단계
		answer = fourth_step(answer);

		// 5단계
		answer = fifth_step(answer);

		// 6단계
		answer = sixth_step(answer);

		// 7단계
        answer = seventh_step(answer);

        return answer;
		
    }

    public String first_step(String new_id){
        return new_id.toLowerCase();
    }

    public String second_step(String new_id){
        String match = "[^0-9a-zA-Z\\-\\.\\_\\\\s]";
        return new_id.replaceAll(match, "");
    }

    public String third_step(String new_id){
		while (true) {
			if (new_id.indexOf("..") == -1)
				break;
			new_id = new_id.replace("..", ".");
		}
        return new_id;
    }
    
    public String fourth_step(String new_id){
        if (new_id.charAt(0) == '.') {
			new_id = new_id.substring(1);
		}
		if (new_id.length() > 1) {
			if (new_id.charAt(new_id.length() - 1) == '.') {
				new_id = new_id.substring(0, new_id.length() - 1);
			}		
		}
        return new_id;
    }

    public String fifth_step(String new_id){
        if(new_id.equals("")) {
			new_id = "a";
		} else {
			new_id = new_id.replaceAll(" ", "");
		}
        return new_id;
    }

    public String sixth_step(String new_id){
        while (new_id.length() > 15) {
			new_id = new_id.substring(0, new_id.length() - 1);
		}
        return new_id;
    }

    public String seventh_step(String new_id){
        while (new_id.length() < 3) {
			new_id += new_id.charAt(new_id.length() - 1);
		}
		if (new_id.charAt(new_id.length() - 1) == '.') {
			new_id = new_id.substring(0, new_id.length() - 1);
		}
		return new_id;
    }
}
