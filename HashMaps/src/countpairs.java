import java.util.HashSet;

public class countpairs {
    public static void main(String[] args) {
        int arr[] = {7,2,3,5,7};
        int k =14 ;


        HashSet<Integer> list = new HashSet<>();
        int count =0;
         for (int num: arr){
             if(list.contains(k-num)){
                 count++;
             }

             list.add(num);
         }

        System.out.println(count);
    }
}
