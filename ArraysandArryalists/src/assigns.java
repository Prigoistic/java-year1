import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class assigns {
//    public static int[] change(int[] nums) {
//        int[] newarr = Arrays.copyOf(nums,nums.length+nums.length);
//       System.arraycopy(nums,0,newarr,nums.length,nums.length);
//
//        return newarr;
//    }
//
    public static void main(String[] args) {

        String sad = "aabca";
        System.out.println(assign(sad));
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i=0;i<n;i++){
//            arr[i] = scanner.nextInt();
        }

//        int[] newar = assign(arr);
//        System.out.println(Arrays.toString(newar));
////
//
//
//    }
public static int assign(String s) {
    Set<Character> counting = new HashSet<>();
    for (char c: s.toCharArray()){
        counting.add(c);
    }
    int count =0;
    for(int i:counting){
        int a = -1;
        int b =0;

        for (int j=0;j<s.length();j++){
            if (s.charAt(j)==i){
                if (a==-1){
                    a=j;
                }else
                    b=j;

            }
        }
        Set<Character> between = new HashSet<>();
        for (int k=a+1;k<b;k++){
            between.add(s.charAt(k));

        }
        count+=between.size();


    }

return count;
}
}
