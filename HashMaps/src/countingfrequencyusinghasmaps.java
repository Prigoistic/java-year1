import java.util.HashMap;

public class countingfrequencyusinghasmaps {
    public static void main(String[] args) {
        int[] arr = {3,5,5,3,3,7,8,9};

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] count = {};

        for(int num: arr){
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        System.out.println(map);
    }
}
