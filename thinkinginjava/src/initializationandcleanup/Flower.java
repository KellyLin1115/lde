package initializationandcleanup;

/**
 * Created by donger on 4/15/18.
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals){
        petalCount = petals;
        System.out.println("Constructor int arg only. petalCount = " + petalCount);
    }

    Flower(String ss){
        s = ss;
        System.out.println("Constructor String arg only. s = " + s);
    }

    Flower(int petals, String s){
        this(petals);
        this.s = s;
        System.out.println("Constructor String & int");
    }

    Flower(){
        this(15, "hi");
        System.out.println("Default constructor no args");
    }
    void printPetalsCount(){
        System.out.println("petalsCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args){
        Flower flower = new Flower();
        flower.printPetalsCount();
    }
}
