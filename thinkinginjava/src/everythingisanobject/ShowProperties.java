package everythingisanobject;

/**
 * Created by donger on 4/14/18.
 */
public class ShowProperties {

    public static void main(String[] args){
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
