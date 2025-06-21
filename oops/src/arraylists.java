public  class arraylists {
    private int[] arr;
    private int size;
    private int capacity;

    public arraylists(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    public void add(int x) {
        if (size == capacity) {
            capacity *= 2;
            int[] temp = new int[capacity];
            System.arraycopy(arr, 0, temp, 0, size);
            arr = temp;
        }
        arr[size++] = x;
    }

    public int get(int index) {

        return arr[index];
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {

        arraylists obj = new arraylists(4);
        obj.add(4);
        System.out.println(obj.get(0));
        System.out.println(obj.size());



    }
}