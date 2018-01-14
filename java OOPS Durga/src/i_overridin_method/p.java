
/**
 * Created by Rishabh on 09/01/2018.
 */
public class p {
    public void propertey() {
        System.out.print('a');
    }

    public void marry()  //OVERRIDDEN METHOD
    {
        System.out.print('s');
    }


}

class child extends p {
    //redefined method
    public void marry()//OVERRIDDING METHOD
    {
        System.out.print('z' + 'x' + 'a');
    }
}

class Test {
    public static void main(String args[]) {
        p p1 = new p();
        p1.marry();//parent calss method calls

        child c1 = new child();
        c1.marry();//child class method calls

        p p2 = new child();
        p2.marry();//first jvm check that this class in p is or not then it will check in child if it has then it will go to the child


    }
}


//here parent class has two method and teh child class is also have method of one of the parent class method
//which is redefine the method of parent class ..like bapp ko ladki passand h but beta apne man ki krna chata h to method overrding krega
//through inheritence
//if CHILD class not Satisfied with oarent class implemantation then child is allowed to redifne the method based on its requirment
//this process is called overridding













