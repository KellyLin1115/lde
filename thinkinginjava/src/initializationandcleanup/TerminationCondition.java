package initializationandcleanup;

/**
 * Created by donger on 4/15/18.
 */
class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn(){
        checkedOut = false;
    }

    protected void finalize() throws Throwable {
        if(checkedOut) {
            System.out.println("Error: Checked out");
        }

        super.finalize();
    }
}
public class TerminationCondition {
    public static void main(String[] args){
        Book novel = new Book(true);
        novel.checkIn();
        //Drop the reference, forget to clan up
        new Book(true);
        System.gc();
    }
}
