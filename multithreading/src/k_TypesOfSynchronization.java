/**
 * Types - java Process synchronization ni hota
 * Thread synchronization is of two types ->
 * Mutual Exclusive -> Can be achived by 3 ways
 * 1. By "Synchronized Method"
 * 2. By "Synchronized Block" -> this improves performance - Line of code
 * 3. By "Static Synchronization"
 * Backend working is important
 */

public class k_TypesOfSynchronization {

}

/**
 * 2. By "Synchronized Block" ->
 * this improves performance - Line of code
 * scope is very less and require object reference
 */
class BookTheaterSeatSynBlock {
    int capecity = 10;

    void bookSeat(int seat) {
        // 1000 line of code
        synchronized (this) { // this current object ka reference hai.
            // synchronized (object reference Expression)
            if (seat > capecity) {
                System.out.println("Seat booked " + Thread.currentThread().getName());
                return;
            } else {
                capecity = capecity - seat;
            }
        }
        // 1000 line of code
    }
}

class MovieBookingAppSynBlock extends Thread {
    static BookTheaterSeatSynBlock b;
    int seat;

    public static void main(String[] args) {
        b = new BookTheaterSeatSynBlock();
        MovieBookingAppSynBlock deep = new MovieBookingAppSynBlock();
        deep.seat = 10;
        MovieBookingAppSynBlock raj = new MovieBookingAppSynBlock();
        raj.seat = 10;
        deep.start();
        raj.start();

    }

    @Override
    public void run() {
        b.bookSeat(this.seat);
    }
}


/**
 "3. Static Synchronization"
 */