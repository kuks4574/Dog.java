package Dog1;

public class Dog {

String names;
double weight;
int age = 1;

Dog () {
   names = "Bobik";
    weight = 5;
}

Dog (String n, int w) {
 this.names = n;
 this.weight = w;
}

void grow () {
    age++;
    weight += 2.5;
    System.out.println("Dog namet: " + names + " grew by " + "1 year. " + " Now her weight is - " + weight + " kg.");
}

}
class main {
    public static void main(String[] args) {

        Dog scharik = new Dog("Scharik", 2);
        System.out.println("weight " + scharik.names + " - " + scharik.weight + " kg.");
        scharik.grow();

        System.out.println("\n");

        Dog bobik = new Dog();
        System.out.println("weight " + bobik.names + " - " + bobik.weight + " kg.");
        bobik.grow();
    }
}
