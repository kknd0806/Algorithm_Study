package programmers.Level01;

public class Programmers_67256 {
    public String solution (int[] numbers, String hand){
        StringBuilder sb = new StringBuilder();
        int[][] number = {{2,4}, {1,1}, {2,1}, {3,1}, {1,2}, {2,2}, {3,2},{1,3}, {2,3}, {3,3}, {1,4}, {3,4}};
        
        int L_hand = 10;
        int R_hand = 11;

        for(int n : numbers){
            switch (n) {
                case 3: case 6: case 9:
                    sb.append("R");
                    R_hand = n;
                break;
                case 1: case 4: case 7:
                    sb.append("L");
                    L_hand = n;
                break;
                default :
                if(distance(number[R_hand], number[n])>distance(number[L_hand], number[n])){
                    sb.append("L");
                    L_hand = n;    
                } else if (distance(number[R_hand], number[n])<distance(number[L_hand], number[n])){
                    sb.append("R");
                    R_hand = n;
                } else {
                    if(hand.equals("right")){ 
                        sb.append("R");
                        R_hand = n;
                    } else {
                        sb.append("L");
                        L_hand = n;
                    }
                }
                    
            }
        }
        return sb.toString();
    }

    private int distance (int[] loc1, int[] loc2){
        return Math.abs(loc1[0]-loc2[0]) + Math.abs(loc1[1]-loc2[1]);
    }  
}
