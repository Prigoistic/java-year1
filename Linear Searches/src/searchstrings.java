public class searchstrings {
    public static void main(String[] args) {
        String name = "Priyam";
        char target = 'i';
        System.out.println(search(name,target));

    }
    static boolean search(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for (char c:str.toCharArray()){
            if (c==target){
                return true;
            }
        }
        return false;

    }


}
