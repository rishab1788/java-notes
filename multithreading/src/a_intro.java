
/**
 * Multithreading in Java is a process of executing multiple threads simultaneously.
 * <p>
 * Thread t1 , t2 , t3 -> t1 (file download, sending mail , processing algos )
 * Like -> OS ---
 * VLC Process(T1(song),T2 (import songs)),
 * IDM File Download(T1(movie download), T2 (songs download))
 */


/**
 * Advantages of Java Multithreading
 * 1) It doesn't block the user because threads are independent and you can perform multiple operations at the same time.
 * 2) You can perform many operations together, so it saves time.
 * 3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.
 */
public class a_intro {
    /* Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Hello: " + i + " Thread: " + Thread.currentThread().getName());

                        try {
                            Thread.sleep(100);
                       } catch (InterruptedException ignored) {}
                    }  }
            });
            thread1.start();
        }
    */
    //  Using Thread Anonymous
    Thread t1 = new Thread(() -> System.out.println("EMAIL SENDER"));
    Thread t2 = new Thread(() -> System.out.println("File Populate"));
    Thread t3 = new Thread(() -> System.out.println("RAPI Consume"));

    static void howToUseThread() {
        //  JAVA.Lang package-> Thread and Runnable and Thread class has all the functionality
        //  Using Runnable implement Runnable class
        //  Using Thread Anonymous
        //  Using extending Thread implementing run

        MyMailThread myMailThread = new MyMailThread();
        Thread thread = new Thread(myMailThread);

        MyWelcomeThread myWelcomeThread = new MyWelcomeThread();

        thread.start();

        myWelcomeThread.start();
    }


    public static void main(String[] args) {
        MyWelcomeThread myWelcomeThread = new MyWelcomeThread();


        MyMailThread myMailThread = new MyMailThread();
        Thread thread = new Thread(myMailThread);
        thread.setPriority(1);
        myWelcomeThread.setPriority(10);
        thread.start();
        myWelcomeThread.start();
    }

}

class MyMailThread implements  Runnable{

    @Override
    public void run() {
        for( int i= 0;i<100;i++) {
            System.out.println("MyMail sent");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class MyWelcomeThread extends  Thread{

    // if we dont create run method left it empty it will work and return
    @Override
    public void run() { for( int i= 0;i<100;i++) {
        System.out.println("MyWelcomeThread Consume");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}

