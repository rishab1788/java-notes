/**
 * Inter-Thread Communication is a mechanism in which thread released a lock
 * and enter to the paused state and another thread acquire lock.
 * 1.wait()-> if any thread calls wait method, it causes the current thread to release the lock and wait
 *            until another thread invokes and notify() or notifyAll() or a specified time elasped.
 *
 * 2.notify() -> this method is used to wake up single thread and release object lock.
 *
 * 3. notifyAll() -> this method is used to wake up all thread that are in waiting state.
 *
 * Condition -> to call this method thery should own the lock to that object
 *              should be inside the synchronized area.
 * */
public class m_InterThreadCommunication {

// This methods are object class methods
}


class Customer{
    int amount=10000;

    synchronized void withdraw(int amount){
        System.out.println("going to withdraw...");

        if(this.amount<amount){
            System.out.println("Less balance; waiting for deposit...");
            try{wait();
            }catch(Exception e){}
        }
        this.amount-=amount;
        System.out.println("withdraw completed..." + this.amount);
    }

    synchronized void deposit(int amount){
        System.out.println("going to deposit...");
        this.amount+=amount;
        System.out.println("deposit completed... " + this.amount);
        notify();
    }
}

class Test{
    public static void main(String args[]){
        final Customer c=new Customer();
        new Thread(){public void run(){c.withdraw(15000);}
        }.start();
        new Thread(){public void run(){c.deposit(10000);}}.start();
    }}