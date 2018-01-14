package h_overloading;

/**
 * Created by Rishabh on 05/01/2018.
 */
public class a_overloading {

    //two method with same name with diffrent arguments is known as method overloading
    //its also known as early bindin and compile time overloading
    public  int m1(int ,float);

    public int m1(float);




    //  abs(10.5);-> 10.5
    //abs(-10.50);->10.5

    //in c we have differetn type for absolute function
    abs(int );
    fabs(float);
labs(long);


//but in java hopefully we have methodoverloading for this
    abs(long);
    abs(int);
    abs(float);


}



CASE1

//IMP NOTES for whose method does not  exist

//if we have class like
class Test
{
    public static int m1(int a ){}


    public static int m1(float b){}


public static void main(String...args)
{

    m1(10);

    m1(10.45f);



m1('a');//here what is happening is that m1 with char argu going to call int cause widing is happening

    //WIDENING  facts-
    //char-int-long -float-Double
//byte-short-int-long-float-Double

  //  and if we do
    m1(10.5);//float cant affoard double
}
}






CASE 2

//WHILE WORKING WITH OBJECTS AND STRING we can oerload tham but confusion in when we send 'null' to method argu

test t;
t.m1(object o);
t.m1('sfsd');
t.m1(null);//STRING METHOD WILL CAll;always done with child when we have that ,beacuse object class is paernt




CASE 3:

//when we have same level method like STRING BUFFER- and STRING than if we do case 2 than what will happen

        test t;
        t.m1(Srtingbuffer 's');
        t.m1('sfsd');
        t.m1(null);// here we het ambigutiy in calling string buffer string gotta  cause they have same leve SO CE WILL ARRISE



CASE 4:
when we have method like .

public  int m1(int ,float);
public  int m1(float, int );


than if call   m1(10,10);//so it gives CE WITH that ambigious cause if we take hindi we ltor we take 1st one
//but in pak rtoL happen and java is country independent so it will give ambigious point

than if we call  m1(10.5,10.5);//we will get CE with cant find symbol cant happen widing folat to int



case 5:

    when we have genral method like-

 public  int m1(int x);


public  int m1(int ...x);

than if we call m1();//genral
m1(10,20)// genral method
m1(10);//genral method always call



CASE 6:

//when we have two classes base and child and the third test and if overload method with the arguments of thier refrence


class base
{}
class derived extends  base{}

class test {
    void ms(base B) {
    }

    void ms(derived d) {
    }
}

public static void main(String ...args)
{
    test t=new test();
base b=new base();
    t.ms(b);//BASE
    derived d=new derived();
    t.ms(d);//DERVIED

    base b5=new derived();

    t.ms(b5);//goto the base OBJECT


}
}