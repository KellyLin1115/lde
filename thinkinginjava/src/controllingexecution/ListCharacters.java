package controllingexecution;

/**
 * Created by donger on 4/15/18.
 */
public class ListCharacters {
    public static void main(String[] args){
        for(char c = 0; c < 128; c++){
            if(Character.isLowerCase(c))
                System.out.println("(int) c = " + (int)c + " character: " + c);

        }
    }
}
