import java.util.concurrent.RecursiveTask;

public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public customStack(){
        this(DEFAULT_SIZE);

    }
    public customStack(int size) {
        this.data = new int[size];
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot pop empty stack");
        }

        return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peeek empty stack");
        }
        return data[ptr];

    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("sTACK IS FULL");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    private boolean isFull(){
        return ptr == data.length-1;

    }

    private boolean isEmpty(){
        return ptr==-1;
    }

    public int getMid() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty stack");


        }

        return data[ptr/2];
    }


    public int popMid() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty stack");
        }

        int mid = data[ptr/2];
        for(int i = 0; i<ptr;i++){
            data[i] = data[i+1];
        }

        ptr--;

        return data[mid];
    }

    public static void main(String[] args) throws Exception {
        customStack stack = new customStack();
        stack.push(3);
        stack.push(5);
        stack.push(8);
        stack.push(6);
        stack.push(77);
        stack.push(34);
        stack.push(734);
        stack.push(7556);
        stack.push(23); 

        System.out.println(stack.getMid());
        System.out.println(stack.pop());
        System.out.println(stack.popMid());
    }


}
