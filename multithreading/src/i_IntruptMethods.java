/**
 * 1 use - > its used to interrupt an execution method
 * <p>
 * 2. method will only works when the thread is in sleeping or waiting state.
 * <p>
 * 3. if thread is not sleeping or waiting state calling an interrupt method
 * will perform normal behaviour.
 * 4. throws intruppted method.
 * <p>
 * If any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked),
 * calling the interrupt() method on the thread,
 * breaks out the sleeping or waiting state throwing InterruptedException.
 *
 * like waiting for bus 2hour and after it interrupt method so that we can take our bus.
 *
 */
public class i_IntruptMethods {
}

class InterruptExample extends Thread {
    @Override
    public void run() {

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted state");
        }
    }

    public static void main(String[] args) {
        InterruptExample i = new InterruptExample();
        i.start();
        i.interrupt();
    }
}