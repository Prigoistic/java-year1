public class Class2 {

        public static char duplicate(String str){
            if(str==null || str.isEmpty()==true){
                return 'x';
            }

            char prev = str.charAt(0);
            char result = '\0';

            for(int i = 0;i<str.length();i++){
                char current = str.charAt(i);
                if(current!=prev){
                    result = current;
                }

                prev = current;

            }

            return  result;


        }



    public static void main(String[] args) {
        String s = "abbaccx";
        System.out.println(duplicate(s));
    }


}
