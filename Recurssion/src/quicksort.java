import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,6};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));


    }

    public static void sort(int[] arr, int s, int e){
        if(s>=e){
            return;
        }

        int start = s;
        int end = e;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];

        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;

            }
        }

        sort(arr,s,end);
        sort(arr,start,e);
    }
}
