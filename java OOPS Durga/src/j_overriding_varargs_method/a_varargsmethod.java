package j_overriding_varargs_method;

/**
 * Created by Rishabh on 12/01/2018.
 */
public class a_varargsmethod {
    //we can't override method with varargs;
//varagrs method


    class parent {
        protected void m1(int ... x) {

        }
    }

    class child extends parent{
        void m1(int x) {

        }
    }

class test
{

    public void main(String agrs[])
    {
parent p=new parent();
p.m1(10);//parent method

child  c=new child();
        c.m1(10);//child method
        c.m1(10,20); //use parent method overloading

 parent  p1=new child();
p1.m1(10);//it will call parent class method cause there will be no overloading between two methods
//and if we make parent class as int x than it will become normal overriding
    }

}




}