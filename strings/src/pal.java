public class pal {
    public static void main(String[] args) {
        String sst = "priyam";
        System.out.println(pals(sst));

    }

    static boolean pals(String str){
        str = str.toLowerCase();
        int start = 0;
        int end = str.length()-1;
        while (start<=end){
            if (start!=end){
                return false;
            }else{
                start++;
                end--;
            }


        }
        return true;
    }
}
