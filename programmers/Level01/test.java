package programmers.Level01;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1번");
        list.add("2번");
        list.add("1번");
        list.add("4번");

        System.out.println(list.indexOf("1번"));
        list.remove(list.indexOf("1번"));
        
        System.out.println(list.indexOf("1번"));
    }
}
