/**
 * Daemon thread in java is a service provider thread that provides services to the user thread.
 * Its life depend on the mercy of user threads
 * i.e. when all the user threads dies, JVM terminates this thread automatically.
 */
public class d_DeamonThreads extends Thread {
// There are many java daemon threads running automatically e.g. gc, finalizer etc.
// It is a low priority thread


    /**
     * 1)public void setDaemon(boolean status)	is used to mark the current thread as daemon thread or user thread.
     2)	public boolean isDaemon()	is used to check that current is daemon.*/
    public static void main(String[] args) {

        Thread daemonThread = new Thread();
        // we have to create daemon thread before making daemon else illegalStateException
        daemonThread.setDaemon(true);
        daemonThread.start();
        // we cant crate main thread to daemon
       Thread.currentThread().setDaemon(true); //  will give error

    }


    /**
     * The sole purpose of the daemon thread is that it provides services to user thread for background supporting task.
     * If there is no user thread, why should JVM keep running this thread. That is why JVM terminates the daemon thread if there is no user thread.
     */
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("daemon");
        }
    }

}
