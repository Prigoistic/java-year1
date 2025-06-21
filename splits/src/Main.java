import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sum(n);
        System.out.println(k);
    }
    public static  long sum(long n){
        if(n==1){
            return 1;
        }
        long start=1;
        long end=n;
        long count=0;
        while(start<=end){
            long mid=start+(end-start)/2;


            if(n%mid==0){
                count=mid;
                start=mid+1;
            }
            else if(n%mid!=0 && (n/mid)>1){
                count=mid;
                start=mid+1;

            }
            else{
                end=mid-1;
            }
        }
        if(n==2){
            return count;
        }
        return count+1;
    }

}

