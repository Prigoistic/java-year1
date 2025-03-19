import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {
                1,2,3,
                4,5,6,
                7,8,9
        };

        int target = 10;

        System.out.println(binarySearch(arr,target));


    }


    public static int binarySearch(int[] arr, int target){
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            if(arr[mid]==target){
//                return 0;
//            } else if (arr[mid]>target) {
//                end = mid - 1;
//            }else{
//                start = mid + 1;
//            }
//        }
//
//        if(start>=arr.length){
//            return Math.abs(arr[end]- target);
//        } else if (end<0) {
//            return Math.abs(arr[start]- target);
//
//        }else{
//            return Math.min((Math.abs(arr[start]- target)),Math.abs(arr[end]-target));
//        }

        HashSet<Integer> list = new HashSet<>();
        HashSet<Integer> pairs = new HashSet<>();

        for(int num: arr){
            list.add(num);
        }


        if(target==0){
            HashSet<Integer> duplicates = new HashSet<>();
            for(int num: arr){
                if(!duplicates.add(num)){
                    pairs.add(num);
                }
            }
            return pairs.size();
        }

        for(int num: list){
            if(list.contains(num+target)){
                pairs.add(Math.min(num,num+target));
            }
        }

        return pairs.size();


    }



}

