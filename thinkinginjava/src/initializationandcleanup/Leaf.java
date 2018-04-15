package initializationandcleanup;

/**
 * Created by donger on 4/15/18.
 */
public class Leaf {
    int i = 0;
    Leaf increment(){
        i++;
        return this;
    }

    void print(){
        System.out.println("i = " + i);
    }

    public static void main(String[] args){
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment().print();
    }
}
