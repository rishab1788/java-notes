package f_hasARElationship;

/**
 * Created by Rishabh on 04/01/2018.
 */
public class A_hasARElationship {

    //also known as composition# aggregation
    //car and engine
    //no specific keyword but new can be used


    //ADVANAGES.-

    //1.reusabilitiy



    //DDifference bw composition and aggregation
   // compotition is strong container ship example university branches.cse,me,ee.
    //contained object hold the object

    //AGREGRATION weekley assosiated with
    //aggegration hold the reference of the object.




    // Class1
// Parent class
    public class Car {

        // Instance members of class Car
        private String color;
        private int maxSpeed;

    }
        // Class2
// Child class
// Helper class
    class Maserati extends Car {

        // Method in which it is shown
        // what happened with the engine of Puslar
        public void MaseratiStartDemo()
        {
            // Creating an object of Engine type
            // using stop() method
            // Here, MaseratiEngine is name of an object
            Engine MaseratiEngine = new Engine();
            MaseratiEngine.start();
            MaseratiEngine.stop();
        }
    }

    // Class 3
// Helper class
    class Engine {

        // Method 1
        // To start a engine
        public void start()
        {
            // Print statement when engine starts
            System.out.println("Started:");
        }

        // Method 2
        // To stop a engine
        public void stop()
        {
            // Print statement when engine stops
            System.out.println("Stopped:");
        }
    }


}




//AGREGRATION-

class Test {}
class Demo{

    Test t;


}

