package programmers.Java.Level02;
import java.util.*;
import java.util.Map.Entry;
public class Programmers_258711 {
    public static void main(String[] args) {

            int[][] edges = {{2, 3}, {4, 3}, {1, 1}, {2, 1}};
            solution(edges);
    
            int[][] edges2 = {{4, 11}, {1, 12}, {8, 3}, {12, 7}, {4, 2}, {7, 11}, {4, 8}, {9, 6}, {10, 11}, {6, 10}, {3, 5}, {11, 1}, {5, 3}, {11, 9}, {3, 8}};
            solution(edges2);

    }

    private static int[] solution(int[][] edges) {
        Map<Integer, Road> map = setMap(edges);

        int doughnut = 0;
        int stick = 0;
        int eight = 0;

        int center = getCenter(map);
        
        Road road = map.get(center);
        
        for(Integer r : road.getOutput()) {
            int base = r;
            
            List<Integer> temp = map.get(base).getOutput();
            while(true) {

                if(temp == null || temp.size() == 0) {
                    stick++;
                    break;
                } else if(temp.size() == 2) {
                    eight++;
                    break;
                } else if(temp.size() == 1) {
                    if(base == temp.get(0)) {
                        doughnut++;
                        break;
                    } else {
                        temp = map.get(temp.get(0)).getOutput();
                    }
                }
            }
        }

        int[] result = {center, doughnut, stick, eight};
        System.out.println(center + "," + doughnut + "," + stick + "," + eight);
        return result;
    }

    private static Map<Integer, Road> setMap(int[][] edges) {
        Map<Integer, Road> resultMap = new HashMap<>();

        for(int[] edge : edges) {
            if(!resultMap.containsKey(edge[0])) {
                resultMap.put(edge[0], new Road());
            }
            if(!resultMap.containsKey(edge[1])) {
                resultMap.put(edge[1], new Road());
            }
            resultMap.get(edge[0]).addOutput(edge[1]);
            resultMap.get(edge[1]).addInput(edge[0]);
        }

        return resultMap;
    } 

    private static int getCenter(Map<Integer, Road> map) {
        int maxKey = -1;
        int maxOutputSize = -1;

        for (Map.Entry<Integer, Road> entry : map.entrySet()) {
            int key = entry.getKey();
            Road road = entry.getValue();

            if (road.getInputSize() == 0 && road.getOutputSize() > maxOutputSize) {
                maxOutputSize = road.getOutputSize();
                maxKey = key;
            }
        }

        return maxKey;
    }
}

class Road {
    private List<Integer> input = new ArrayList<>();
    private List<Integer> output = new ArrayList<>();

    public void addInput(int num) {
        this.input.add(num);
    }
    public void addOutput(int num) {
        this.output.add(num);
    }
    public int getInputSize() {
        return input.size();
    }
    public int getOutputSize() {
        return output.size();
    }
    public List<Integer> getOutput() {
        return this.output;
    }
}
