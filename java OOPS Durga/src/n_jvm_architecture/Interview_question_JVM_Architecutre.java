package n_jvm_architecture;

public class Interview_question_JVM_Architecutre {
/**
 * Q. What is JVM in java?
 *
 * JVM stands for Java virtual machine
 * JVM is the virtual machine on which java code executes.
 * JVM is responsible for converting byte code into machine specific code.
 *
 *
 * Q. What is Class Loader Subsystem of JVM? What is its functioning and purpose?
 * Classloader is a subsystem of JVM.
 * Classloader is used to load class files.
 * Classloader verifies the class file using byte code verifier. Class file will only be loaded if it is valid.
 *
 */

/**
 * Q. What are Runtime Data Areas of JVM? Discuss in detail?
 * Answer.   It is another important jvm interview question for experienced developers. There are following Runtime Data Areas in JVM >
 * 1) Method Area >
 * Method area is also called class area.
 * Method area stores data for each and every class like fields,constant pool,method’s data and information.
 * 2) Heap >
 * Heap is place where all objects are stored in JVM (java virtual machine).
 * Heap even contains arrays because arrays are objects.
 * 3) Java Threads (Java thread Stacks) >
 * You must know that each and every thread has its own stack.
 * How stack frames are created when thread calls new method?
 * As we know each and every thread has its own stack.
 * Whenever new method is called new stack frame is created and it is pushed on top of that thread's stack.
 *
 */
/**
 * Q. What does thread stack contains?
 * The stack contain
 * All the local variables,
 * All the parameters,
 * All the return address.
 * Does stack stores/contains object OR what stack doesn’t contains?
 * Stack never stores object, but it stores object reference.
 *
 * 4) Program counter registers (PC Registers) >
 * Program counter registers contains >
 * the address of instructions currently being executed and
 * address of next instruction as well.
 *
 * */


/**
 * Q. Mention some of the most important VM (JVM) PARAMETERS you have used in JVM Heap memory?
 * Answer.  It is very very important garbage collection interview question for fresher and experienced developer.
 *
 * -Xms : Xms is minimum heap size which is allocated at initialization of JVM.
 * Examples of using -Xms VM (JVM) option in java >
 * java -Xms512m MyJavaProgram
 * It will set the minimum heap size of JVM to 512 megabytes.
 *
 *
 *-Xmx : Xmx is the maximum heap size that JVM can use.
 * Example of using -Xmx VM option in java >
 * java -Xmx512m MyJavaProgram
 * It will set the maximum heap size of JVM to 512 megabytes.
 *
 *
 * */
}
