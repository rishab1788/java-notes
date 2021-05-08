package o_solid;

/**
 * The single responsibility principle states that every Java class must perform a single functionality.
 * <p>
 * <p>
 * Implementation of multiple functionalities in a single class mashup the code and if any
 * modification is required may affect the whole class.
 * It precise the code and the code can be easily maintained
 * <p>
 * EXAMPLE -  Student is a class having three methods namely printDetails(), calculatePercentage(), and addStudent().
 *
 * Testing – A class with one responsibility will have far fewer test cases
 * Lower coupling – Less functionality in a single class will have fewer dependencies
 * Organization – Smaller, well-organized classes are easier to search than monolithic ones
 */

public class B_SingleResponsibiltiyPriniciple {
}

class StudentSRPExample {
    public void printDetails() {
//functionality of the method
    }

    public void calculatePercentage() {
//functionality of the method
    }

    public void addStudent() {
//functionality of the method
    }
}

//according to the principle
class Student {
    public void addStudent() {
//functionality of the method
    }
}

class PrintStudentDetails {
    public void printDetails() {
//functionality of the method
    }
}

class Percentage {
    public void calculatePercentage() {
//functionality of the method
    }
}