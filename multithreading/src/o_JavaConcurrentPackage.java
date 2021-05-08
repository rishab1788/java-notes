import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Java.util.concurrent
 * Java Concurrency package covers concurrency, multithreading, and parallelism on the Java platform.
 * Concurrency is the ability to run several or multi programs or applications in parallel.
 * The problem with Synchronized block -
 * (i). To avoid synchronized deadlock ( cant use without waiting)
 * (ii). Fairness possibilities is not in threadings.
 * (iii).until getting lock can continue execution remaining.
 * (iv). the synchronized method we have to compulsory used either a method level or within a method level.
 * and its possiblle to use method accross
 * <p>
 * 1.5 Version
 */
public class o_JavaConcurrentPackage {

}
/*
 * The backbone of Java concurrency are threads (a lightweight process,
 *  which has its own files and stacks and can access the shared data from other threads in the same process).
 * */


/**
 * Lock Interface object - is similar to implicit lock to execute synchronizeed method
 * lock(), trylock(),trylock(long l,timeunit t), lockInterruptibilty(),
 * unlock();
 * <p>
 * L.lock() Method can be used to acquire a lock. if lock is already availble.
 * then current thread get the lock. if the lock is not already available.
 * then it will getting the lock. exactly same behaivour as synchronized keyword.
 * boolean tryLock(); -> if available return true
 * 100 % -> 5 % will try ->  1% success
 * if(l.tryLock()){} // l.trylock(long l , Timeunit)
 * else {// try alternate}
 * <p>
 * void lockInterruptibility() - while waiting thread got interrupted it wont get lock.
 */
class LockExample {
    void lock() {
    }

}

/**
 * l.unlock() -> to call this method compulsory current thread should be ownere of the lock.
 * else we get illegal montier exception
 * <p>
 * Interface object - is simmilar to implict lock to execute synchronizeed method
 * *
 */


/**
 * ReentrentLock(); ->  it is implementation is the implemenation of Lock interface and extends Object .
 * and its a direct child class of a object.
 * here reenterent lock means.
 * hold count  = 0; same lock can have holdcount;
 * <p>
 * Re entenet means a thread can acquire same lock multiple times
 * internally reentrent increaments threads personal count whenever we call
 * lock() method and decrements when we call unlock method
 * and lock will be release whenever count reaches 0.
 */

class ReenterentLocksExample extends Thread {

    static ReentrantLock fairNessLock = new ReentrantLock(true);// fairness
    ReentrantLock l = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        fairNessLock.lock();
        fairNessLock.tryLock();
        fairNessLock.tryLock(2l, TimeUnit.DAYS);
        fairNessLock.lockInterruptibly();
        fairNessLock.unlock();


        // getholdcount ->
        fairNessLock.getHoldCount();
        fairNessLock.isFair();
    }

    // with the given fairness policy if the fairness is true then longest waiting thread can acquire the lock if it avaiable.
    // it follows first come first server policy
    // if fairness is false then which threading will get the chance we cant expectr.
    // default value is false;
    /*5 methods of Lock*/
    @Override
    public void run() {
        l.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println("--" + i);
        }
        l.unlock();
    }

    /**
     * Demo program for Try Lock method
     */

    public void running() {
        if (l.tryLock()) {
            for (int i = 0; i < 10; i++) {
                System.out.println("--" + i);
            }
            l.unlock();
        } else {
            System.out.println("lock not found so doing that");
        }
    }
}

/**
 * Semaphores -> Semaphores are used to control access of a shared resource
 * Train Signal where can be a multiple signal wait() and signal()
 */

class SemaphoresExample {
    Semaphore semaphore = new Semaphore(3); // only three threads can work simultenously

    public void useSemphore() {

    }

}

/**
 * Mutex - its all about locking - the process shall require
 * Mutex is the Semaphore with an access count of 1. Consider a situation of using lockers in the bank.
 * Usually the rule is that only one person is allowed to enter the locker room.
 */
