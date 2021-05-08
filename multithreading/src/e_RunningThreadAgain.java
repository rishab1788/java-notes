public class e_RunningThreadAgain extends Thread {

    public static void main(String[] args) {
        e_RunningThreadAgain t1 = new e_RunningThreadAgain();
        t1.start();
        t1.start(); /*
        running
       Exception in thread "main" java.lang.IllegalThreadStateException*/
    }

    public void run() {
        System.out.println("running...");
    }
}
