package e_isArealatioShip;

/**
 * Created by Rishabh on 04/01/2018.
 */
public class MultipleInheritence {
    //java does not supports Multiple Inheritance
    //cause java class cant extend more than one class at a time
    //hence java provide support for multiple inheritence for classes.
//due to ambiguity problem

    //people can make you fool by saying object class ko to class krti h extend fir agr ek ar class ko krega to multi ple hojyega;;

    //aisa ni hota h phle obejectclass->A->B smje its not like ki   objectclass,A->B
}


//CODE

class A
{}
class  B{}

class C extends A,B //class cant extend multiple classes at a time COMPILE TIME ERROR.
{

}


