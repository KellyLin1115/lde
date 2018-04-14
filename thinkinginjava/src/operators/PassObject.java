package operators;

/**
 * Created by donger on 4/14/18.
 */

class Letter {
    char c;
}

public class PassObject {

    static void f(Letter o){
        o.c = 'z';
    }

    public static void main(String[] args){
        Letter l = new Letter();
        l.c = 'y';
        System.out.println("Before f(): l.c = " + l.c);
        f(l);
        System.out.println("After f(): l.c = " + l.c);
    }
}
