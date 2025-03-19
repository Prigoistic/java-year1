public class starting {

//    //Inheritance
//    static class Base{
//        int rno;
//        String name;
//    }
//    static class child extends Base{
//        String name = "Bobo";
//        void run(){
//            System.out.println("Im here");
//        }
//    }
//
//    public static void main(String[] args) {
//        child obj = new child();
//        obj.run();
//
//    }

    public static class Box {
        double h;
        double w;
        double l;

        public Box(double h, double w, double l) {
            this.h = h;
            this.w = w;
            this.l = l;
        }

        public Box() {
            this.h = -1;
            this.l = -1;
            this.w = -1;
        }

        Box(double side) {
            this.w = side;
            this.l = side;
            this.h = side;

        }

        Box(Box old) {
            this.l = old.l;
            this.w = old.w;
            this.h = old.h;
        }

        public void information() {
            System.out.println("lesgoo");
        }

    }

    public static void main(String[] args) {
        Box box = new Box(4,5,6);
        System.out.println(box.l +" " + box.h+ " " + box.w);
    
    }



}
