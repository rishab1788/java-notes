package e_isArealatioShip;

/**
 * Created by Rishabh on 04/01/2018.
 */
public class A_isARElation {

    //reusibility ,inheritance ,extends
    //its also known as inheritance,

//conclusion-
    //1.what ever parent has child can access  by child reference we can all parent methods/
    //2.parent cant access child specific methods and hence on the parent reference we cant call child specific methods.

    //IMP-polymorphism
    //3parent reference can be used to hold child object but by using that reference we cant call
    // child specific methods and we can in parent.

    //4.child reference cant used to hold parent object.


}


//CODE

class P {
    public void m1() {
    }

    public void ma() {
    }

}

class C extends P {
    public void m2() {
    }

    public void ma() {
    }

}

class test {
    public static void main() {


        P p = new P();
        p.m1();//allowed
        p.m2();//not allowed gives error cant find symbol

        p.ma();


        C c = new C();
        c.m2();
        c.m1();//both allowed


        P p1 = new C();//parent refrence can used to hold child object

        p1.m1();//valid h
        p1.m2();//not valid cc error we will get know in polymorphism ..
        //parent refrence cant use child method with its object
        p1.ma();


        C c1 = new P();//incompitable type found means  C cant store the parent object

    }

}
