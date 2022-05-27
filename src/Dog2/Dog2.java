package Dog2;

public class Dog2 {
    String names, breed, gender;
    double weight;
    double age;

    Dog2() {
        names = "Bobik";
        weight = 5;
        gender = "male";
        breed = "buldog";
        age = 2.5;
    }

    Dog2(String n, int w) {
        this.names = n;
        this.weight = w;
    }

    Dog2(String n, int w, String g) {
        this.names = n;
        this.weight = w;
        this.gender = g;
    }

    Dog2(String n, int w, String g, String b) {
        this.names = n;
        this.weight = w;
        this.gender = g;
        this.breed = b;
    }

    Dog2(String n, int w, String g, String b, double a) {
        this.names = n;
        this.weight = w;
        this.gender = g;
        this.breed = b;
        this.age = a;
    }


    void change(String n, double w) {
        System.out.println("Dog namet: " + names);
        System.out.println("Dog weight: " + weight + " kg");
    }

    void change(String n, int a) {
        System.out.println("Dog namet: " + names);
        System.out.println("Dog age: " + age + " years");
    }

    void change(String n, int w, String g) {
        System.out.println("Dog namet: " + names);
        System.out.println("Dog weight: " + weight + " kg");
        System.out.println("Dog gender: " + gender);
    }

    void change(String n, int w, String g, String b) {
        System.out.println("Dog namet: " + names);
        System.out.println("Dog weight: " + weight + " kg");
        System.out.println("Dog gender: " + gender);
        System.out.println("Dog breed: " + breed);
    }

    void change(String n, int w, String g, String b, double a) {
        System.out.println("Dog namet: " + names);
        System.out.println("Dog weight: " + weight + " kg");
        System.out.println("Dog gender: " + gender);
        System.out.println("Dog breed: " + breed);
        System.out.println("Dog age: " + age + " years");
    }

}
class main2 {
    public static void main(String[] args) {

        Dog2 bobik = new Dog2();
        bobik.change("Bobik", 5,"male", "buldog", 2.5);

        System.out.println("\n");

        Dog2 scharik = new Dog2("Scharik", 2);
        scharik.change("Scharik", 2);

        System.out.println("\n");

        Dog2 layma = new Dog2("Layma", 3, "female");
        layma.change("Layma", 3, "female");

        System.out.println("\n");

        Dog2 mark = new Dog2("Mark", 6, "male", "shepherd dog");
        mark.change("Mark", 6);

        System.out.println("\n");

        Dog2 lisa = new Dog2("Lisa", 4, "female", "taksa", 3.8);
        lisa.change("Lisa", 3.8);

        System.out.println("\n");

        Dog2 barbos = new Dog2("Barbos", 6, "male", "mops");
        barbos.change("Barbos", 6, "male", "mops");
    }
}