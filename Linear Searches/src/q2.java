public class q2 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{5,6,7}};
        System.out.println(wealth(mat));

    }
    static int wealth(int[][] arr) {
        int max =0;

        for (int i = 0; i < arr.length; i++) {
            int rowsum=0;
            for (int j = 0; j < arr[i].length; j++) {
                rowsum = rowsum + arr[i][j];
                if (rowsum>max){
                    max = rowsum;
                }


            }
        }


        return max;

    }

}
