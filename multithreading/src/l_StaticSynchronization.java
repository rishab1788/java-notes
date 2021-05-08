/**
 * Static synchronization is achieved by static synchronized methods.
 * Static synchronized method locked on class and non-static synchronized method locked on current object i.e.
 * static and non-static synchronized methods can run at same time. It can produce inconsistency problem.
 *
 *
 * Bookseat class ->  Two BookSeat Thread caller -> T1,T2 with one thread, T3,T4 with other one thread
 *                     synchronized will work good if we have only one SeatBook caller thread
 *                     but here we have to use synchronized.
 *                     Class Level Lock lagta hai ye.
 *
 *                     Every class in Java has a unique lock which is nothing but a class level lock.
 *                     If a thread wants to execute a static synchronized method, then thread requires
 *                     a class level lock. ... The Class level lock prevents multiple
 *                     threads to enter in a synchronized block in any of all available instances on runtime
 *
 *  */
public class l_StaticSynchronization {
    // if we are having multiple object with single resource static resource

}
class Table{
   static int seat = 0;
    synchronized static void printTable(int n){
        for(int i=1;i<=10;i++){

            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){}
        }
    }
}

class MyThread1 extends Thread{
    public void run(){
        Table.printTable(1);
    }
}

class MyThread2 extends Thread{
    public void run(){
        Table.printTable(10);
    }
}

class MyThread3 extends Thread{
    public void run(){
        Table.printTable(100);
    }
}




class MyThread4 extends Thread{
    public void run(){
        Table.printTable(1000);
    }
}

class TestSynchronization4{
    public static void main(String t[]){
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        MyThread3 t3=new MyThread3();
        MyThread4 t4=new MyThread4();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}