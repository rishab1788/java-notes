/**
 * The join() method waits for a thread to die. In other words,
 * it causes the currently running threads to stop executing until the thread
 * it joins with completes its task.
 */

/**
 * 1. join Threads: if a thread wants to wait for another thread to complete than we should use join method.
 * <p>
 * 2.  DL - > Medical , TestDrive , Officer
 * Deepak
 * <p>
 * 3. Methods - join() , synchronized join(long ms), synchronized join (long ms, int ns)
 * <p>
 * 4. main thread -> if wanted wait for child thread complete.
 * <p>
 * 5. we can also wait thread to let first execute main method
 */

public class f_JoinThread {
}

// example where Main thread letting execute thread first
class TestFirstThreadMain extends Thread {
    public static void main(String[] args) {
        TestFirstThreadMain t = new TestFirstThreadMain();
        t.start();
        try {
            // t.join(); // this ensure that main thread will execute after executing thread
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                sleep(10);
            }
        } catch (Exception ce) {

        }


    }

    @Override
    public void run() {
//        try {
//            Thread.currentThread().join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } // this is deadlock
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MainThreadFirst extends Thread {
    static Thread mainThread;

    public static void main(String[] args) {
        mainThread = Thread.currentThread();
        TestFirstThreadMain t = new TestFirstThreadMain();
        t.start();
        try {
            // t.join(); // this ensure that main thread will execute after executing thread
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                sleep(10);
            }
        } catch (Exception ce) {

        }
    }

    @Override
    public void run() {
//        try {
//            Thread.currentThread().join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } // this is deadlock
        try {
            mainThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}