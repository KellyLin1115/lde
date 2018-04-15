package controllingexecution;

import java.util.Random;

/**
 * Created by donger on 4/15/18.
 */
public class WhileTest {
    static boolean condition(){
        //static method random( ) in the Math library, which generates a double value between 0 and 1. (It includes 0, but not 1.)
        boolean result = Math.random() < 0.99;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args){
        while(condition())
            System.out.println("Inside While");
        System.out.println("Exit While");
    }
}
