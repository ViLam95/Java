package collection_framework.map;

import java.util.HashMap;
import java.util.Map;

public class CountNumber {
    public static void main(String[] args) {
        int[] number = {1,3,5,7,3,2,1};
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int k: number){
            if(numbers.containsKey(k)){
                numbers.put(k, numbers.get(k) + 1);
            }
            else{
                numbers.put(k,1);
            }
        }
        for (Map.Entry<Integer,Integer> entry: numbers.entrySet()){
            System.out.println(entry.getKey() + " xuất hiện " + entry.getValue());
        }
    }
}
