

public class daughter extends parent {
    public daughter() {
        super();
    }

    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name);

    }

    @Override
    void patner(String name, int call) {
        System.out.println("I am fond of" + name + "he is" + call);

    }
}
