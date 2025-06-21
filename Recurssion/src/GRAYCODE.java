import java.util.ArrayList;
import java.util.List;

public class GRAYCODE {
    public static List<String> graycode(int N){
        if(N==0){
            List<String> base = new ArrayList<>();
            base.add("0");
            return base;
        }
        if(N==1){
            List<String> base = new ArrayList<>();
            base.add("0");
            base.add("1");
            return base;
        }

        List<String> previousgraycode = graycode(N-1);
        List<String> generategraycode = new ArrayList<>();

        for(String code : previousgraycode){
            generategraycode.add( "0" + code);
        }

        for(int i = previousgraycode.size();i>=0;i--){
            generategraycode.add("1" + previousgraycode.get(i));
        }

        return generategraycode;


    }

    public static void main(String[] args) {
        int N = 3;
        List<String> graycodes = graycode(N);

    }
}
