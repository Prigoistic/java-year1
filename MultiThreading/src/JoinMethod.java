public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(() ->{
            for(int i =0 ;i<5;i++){
                System.out.println("I was here " + i);
            }
        });

        Thread two = new Thread(() ->{
            for(int i =0 ;i<25;i++){
                System.out.println("I was not here " + i);
            }
        });


        one.start();
        two.start();
        one.join();
        System.out.println("Done doign shit");
    }
}
