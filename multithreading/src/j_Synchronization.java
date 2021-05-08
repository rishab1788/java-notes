/**
 * Synchronization - its the process by which we control the accessibility of multiple threads
 * to a particular shared resource.
 * <p>
 * Problems which can occure -
 * 1. Data Inconsistency.
 * 2. Thraed interface.
 * <p>
 * <p>
 * Advantage of synchronization -
 * 1. No data inconcitancy problem
 * 2. No thread interfernce
 * <p>
 * Disadvantage of synchronization -
 * 1. Increase waiting period.
 * 2. Create performance issue.
 * <p>
 * <p>
 * TO overcome synchronization disadvantages java provides one package - java.util.concurrent
 */
public class j_Synchronization {
/* each object has lock and two area
   synchronized area and non-synchronized area
*  so to access synchronized area object provide lock which can be acuqired by one Thread only.
*
* */
}


class BookTheaterSeat {
    int capecity = 10;

    synchronized void bookSeat(int seat) {
        if (seat > capecity) {
            System.out.println("Seat booked " + Thread.currentThread().getName());
            return;
        } else {
            capecity = capecity - seat;
        }
    }
}

class MovieBookingApp extends Thread {
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