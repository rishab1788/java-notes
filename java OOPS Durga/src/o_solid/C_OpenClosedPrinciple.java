package o_solid;

/**
 * the module should be open for extension but closed for modification.
 *
 * In doing so, we stop ourselves from modifying existing code and causing potential new bugs in an otherwise happy application.
 * Of course, the one exception to the rule is when fixing bugs in existing code.
 *
 *
 */
public class C_OpenClosedPrinciple {
}

/**
 * If we take a look into any good framework like struts or spring, we will see that we can not
 * change their core logic and request processing,
 * but we modify the desired application flow just by extending some classes and plugin them in configuration files.
 *
 *
 * Let's explore the concept further with a quick code example. As part of a new project,
 * imagine we've implemented a Guitar class.
 */
class Guitar {

    private String make;
    private String model;
    private int volume;

    //Constructors, getters & setters
}

/**
 * At this point, it might be tempting to just open up the Guitar class and add a flame pattern –
 * but who knows what errors that might throw up in our application.
 * */

class SuperCoolGuitarWithFlames extends Guitar {

    private String flameColor;

    //constructor, getters + setters
}
/*By extending the Guitar class we can be sure that our existing application won't be affected.*/


/* like create interface calculate and method calc(op1, op2, opeartion)
* and extend it with addOpeartion implements interface;
*
* */