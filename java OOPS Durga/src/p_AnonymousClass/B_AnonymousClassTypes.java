package p_AnonymousClass;

/**
 * (i). Anonymous class that extends the class.
 * (ii). Anonymous that implements that interface.
 * (iii).
 */

public class B_AnonymousClassTypes {

}

abstract class PopCorn {
    abstract public void tastes();
}

/**
 *
 */
class AnonymousClassType1 {
    //  we are creating child class object here
    PopCorn p = new PopCorn() {
        @Override
        public void tastes() {
            System.out.println("Spicy");
        }
    };

    public static void main(String[] args) {
        // runable is also a example its creating child class object
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };
    }
}