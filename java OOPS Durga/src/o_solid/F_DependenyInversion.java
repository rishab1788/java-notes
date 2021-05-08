package o_solid;
/**
 * Dependency Inversion refers to the decoupling of software modules.
 * This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.*/
class F_DependencyInversion {

}
/**
 * The principle states that we must use abstraction (abstract classes and interfaces) instead of concrete implementations.
 * High-level modules should not depend on the low-level module but both should depend on the abstraction. */

/**  It decouples the software. Let's understand the principle through an example.*/
class WindowsMachine
{
    public final keyboard;
    public final monitor;
    public WindowsMachine()
    {
        monitor = new monitor();  //instance of monitor class
        keyboard = new keyboard(); //instance of keyboard class
    }
}

/**
 *  we create a constructor of the class and add the instances of the keyboard and monitor. After adding the instances, the class looks like the following:
 *  */


/** Now we can work on the Windows machine with the help of a keyboard and mouse. But we still face the problem.
 * Because we have tightly coupled the three classes together by using the new keyword.
 * It is hard o test the class windows machine.*/