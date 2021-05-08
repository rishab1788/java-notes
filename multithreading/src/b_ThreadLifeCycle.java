/**
 *              NEW
 *           ----------
 *     *** This block Sleep() done, I/O
 *     *** resume() notify()
 *            Runnable---------<
 *               |              Non Runnable (Blocked)
 *            Running----------^
 *     *** run() method exits stop()
 *           ----------
 *            Terminated
 * */
public class b_ThreadLifeCycle {

}
/**
 * 1) New
 * The thread is in new state if you create an instance of Thread class but before the invocation of start() method.
 *
 * 2) Runnable
 * The thread is in runnable state after invocation of start() method, but the thread scheduler has not selected it to be the running thread.
 *
 * 3) Running
 * The thread is in running state if the thread scheduler has selected it.
 *
 * 4) Non-Runnable (Blocked)
 * This is the state when the thread is still alive, but is currently not eligible to run.
 *
 * 5) Terminated
 * A thread is in terminated or dead state when its run() method exits.
 * */