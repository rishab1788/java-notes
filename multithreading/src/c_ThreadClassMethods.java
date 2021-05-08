public class c_ThreadClassMethods {
    public static void main(String[] args) {
        Thread thread = new Thread(()->System.out.println("Run"));
        thread.getName();  // fetches the name of thread
        thread.setName("KaamKrneWala");
        thread.start(); // start thread by allocation resource
        thread.run();  // contains the task of thraed
        thread.getPriority(); // contains the priority
        thread.setPriority(10);// 1 - 10
        try {
            Thread.sleep(1);
            thread.join();
        } catch (Exception e) {
        }
        thread.interrupt(); //
        thread.isInterrupted(); //
        thread.resume(); //This method exists solely for use with suspend, which has been deprecated because it is deadlock-prone
        thread.stop(); //This method is inherently unsafe. Stopping a thread with Thread.stop causes it to unlock all of the monitors that it has locked
       // wait(),notify,notifyAll() -> all these methods are inside object
    }
}
