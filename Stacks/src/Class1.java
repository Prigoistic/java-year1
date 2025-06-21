////import java.util.Stack;
////import java.util.Vector;
////
////public class Class1 {
////    public class Stack<E> extends Vector<E>{
////        public Stack(){
////
////        }
////            public E push(E item){
////               addElement(item);
////
////               return item;
////            }
////
////
////            public E pop(){
////               E obj;
////               int len = size();
////               obj = peek();
////               removeElementAt(len - 1);
////
////               return obj;
////
////            }
////
////        private E peek() {
////
////
////        }
////
////
////    }
////
////
////
////    public void main(String[] args) {
////        Stack<Integer> stack = new Stack<>();
////        stack.push(1);
////        stack.push(2);
////        stack.push(3);
////        stack.push(4);
////        stack.push(5);
////    }
//
import java.util.ArrayList;
import java.util.Scanner;

public class Class1 {
    public static class newstack<E> {
        private ArrayList<E> list = new ArrayList<>();

        public void push(E item) {
            list.add(item);
        }

        public E pop() throws Exception {
            if (list.isEmpty()) {
                throw new Exception("Empty hai stack");
            } else {
                return list.remove(list.size() - 1);
            }

        }

        public E peek() throws Exception {
            if (list.isEmpty()) {
                throw new Exception("Stack empty hai");
            } else {
                return list.get(list.size() - 1);
            }

        }

        public boolean isEmpty() {
            return list.isEmpty();
        }
    }

    public static void main(String[] args) {
        Class1 outer = new Class1();
        newstack<Integer> stack = new newstack<>();
        newstack<Integer> minstack = new newstack<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = 1;
        for(int i = 0;i<n;i++){
            stack.push(scanner.nextInt());
        }


        System.out.println(stack);
    }
}
//}
//
////
////
////}
