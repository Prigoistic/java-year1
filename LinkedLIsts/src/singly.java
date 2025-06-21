public class singly {
    private Node head;
    private Node tail;
    private int size;

    public singly() {
        this.size = 0;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }

        System.out.println("end");
    }

    public void insertinlast(int val){
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        if(tail == null){
            insertion(val);

        }
        size++;

    }
    public void insertatithposition(int val,int index){
        if(index ==0){
            insertion(val);
            return;
        }

        if(index == size){
            insertinlast(val);
            return;
        }
        Node temp = head;
        for(int i = 1;i<index;i++){
            temp = temp.next;
        }
        Node newnode = new Node(val,temp.next);
        temp.next = newnode;
        size++;

    }


    public void insertion(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail==null){
            tail = head;
        }

        size+=1;

    }

    //insertion using recursion
    public Node insertusingrecursion(int val, int index){
        head = insertRec(val,index,head);
        return head;

    }

    private Node insertRec(int val, int index, Node node){

        if(node==null){
            return new Node(val);
        }
        if(index ==0){
            Node temp = new Node(val,node);
            size++;
            return temp;

        }

        node.next = insertRec(val,index-1,node.next);

        return node;
    }

    public int deletefirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail = null;
        }

        size--;
        return val;
    }
    public int deletelast(){
        if(size<=1){
            deletefirst();
        }
        Node secondlast = get(size-2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;

        return val;
    }
    public Node get(int index){
        Node temp = head;
        for(int i = 0;i<index;i++){
            temp= temp.next;
        }
        return temp;
    }

    public int delete(int index){
        if(index == 0){
            return deletefirst();
        }
        if(index == size-1){
            return deletelast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }
    public Node findIndex(int value){
        Node node = head;
        while(node!=null){
            if(node.value == value){
                return node  ;
            }
            node = node.next;
        }

        return null;
    }





    class Node{
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value){
         this.value = value;
        }

    }

    public static void main(String[] args) {
        singly list = new singly();
        list.insertion(3);
        list.insertion(4);
        list.insertion(5);
        list.insertion(7);
        list.insertion(12);
        list.insertion(66);
        list.insertinlast(69 );
        list.insertatithposition(88,3);
        list.deletefirst();
        list.deletelast();
        list.delete(3);
        list.insertusingrecursion(420,5);
        System.out.println(list.findIndex(88));

        list.display();

    }

}
