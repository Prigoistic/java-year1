import java.util.*;
public class q4 {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> uniqueElements = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            int num = A.get(i);
            boolean isDuplicate = false;
            for (int j = 0; j < A.size(); j++) {
                if (i != j && A.get(j) == num) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueElements.add(num);
            }
        }
        return uniqueElements;
    }
}
