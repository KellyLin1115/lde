package controllingexecution;

/**
 * Created by donger on 4/15/18.
 */
public class IfElse {
    static int result = 0;

    static int test(int testValue, int target){
        if(testValue > target)
            return result = +1;
        else if(testValue < target)
            return result = -1;
        else
            return result = 0;
    }

    public static void main(String[] args){
       result = test(10, 5);
       System.out.println("testValue > target  result = " + result);
       result = test(5, 10);
       System.out.println("testValue < target  result = " + result);
       result = test(10, 10);
       System.out.println("testValue = target  result = " + result);
    }
}
