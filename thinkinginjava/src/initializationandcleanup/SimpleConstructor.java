package initializationandcleanup;

/**
 * Created by donger on 4/15/18.
 */

class Rock {
    Rock(){
        System.out.print("Rock ");
    }
}
public class SimpleConstructor {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            new Rock();
        }
    }
}
