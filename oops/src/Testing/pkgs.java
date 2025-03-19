package Testing;

public class pkgs {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public pkgs(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        pkgs.population+= 1;
    }
}



