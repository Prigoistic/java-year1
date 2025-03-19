import java.util.ArrayList;
import java.util.List;

public class arrayques {
    public static int[] merge(int[] arr1, int[] arr2){
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged.add(arr1[i]);
                i++;
            } else {
                merged.add(arr2[j]);
                j++;    
            }
        }
        while (i < arr1.length) {
            merged.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            merged.add(arr2[j]);
            j++;
        }
        return merged.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {3,6,8,13,16};
        int[] arr2 = {1,9,15,22,44};
        int[] result = merge(arr1,arr2);
        for(int i : result){
            System.out.println(i);
        }
    }


}


