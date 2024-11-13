import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cyclesorts {

    //4123
    static void sort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct = arr[i] -1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }

        }
    }
    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    //assigns
    static int missingnumber(int[]nums){
        int i=0;
        while (i<nums.length){
            int correct = nums[i];
            if (nums[i]< nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }

        }
        for (int j=0;j< nums.length;j++){
            if (nums[j]!=j){
                return j;
            }

        }
        return nums.length;


    }
    //2

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct = nums[i] -1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }

        }
        List<Integer> ans = new ArrayList<>();
        for (int j=0;j<nums.length;j++){
            if (nums[j]!=j+1){
                ans.add(j+1);

            }



        }
        return ans;




    }




}







