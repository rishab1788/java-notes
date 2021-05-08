package o_solid;
/**
 *  which is arguably the most complex of the 5 principles. Simply put,
 *  if class A is a subtype of class B, then we should be able to
 *  replace B with A without disrupting the behavior of our program.*/


/*“Derived types must be completely substitutable for their base types”*/
public class D_LiskovSubstitution {

}
/**
 * Let's just jump straight to the code to help wrap our heads around this concept
 *
 * */


interface Car {

    void turnOnEngine();
    void accelerate();
}
/*Above, we define a simple Car interface with a couple of methods that all cars should be able to fulfill
 – turning on the engine, and accelerating forward.*/
public class MotorCar implements Car {

    private Engine engine;

    //Constructors, getters + setters

    public void turnOnEngine() {
        //turn on the engine!
        engine.on();
    }

    public void accelerate() {
        //move forward!
        engine.powerOn(1000);
    }
}


// HERE Liskov principle break because  ElectricCar doest not have engine
// so car cant replacve Electic car directly
class ElectricCar implements Car {

    public void turnOnEngine() {
        throw new AssertionError("I don't have an engine!");
    }

    public void accelerate() {
        //this acceleration is crazy!
    }
}


//One possible solution would be to rework our model into interfaces that
// take into account the engine-less state of our Car.
// Car -> EngineCar and Non Engine car -> motor car
