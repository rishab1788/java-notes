package n_jvm_architecture;

public class A_JVM {
    /**
     A Virtual Machine is a software implementation of a physical machine.
     Java was developed with the concept of WORA (Write Once Run Anywhere),
     which runs on a VM. The compiler compiles the Java file into a Java .class file, then that .class file is input into the JVM,
     which loads and executes the class file. Below is a diagram of the Architecture of the JVM.
     JVM is the virtual machine on which java code executes.
     JVM is responsible for converting byte code into machine specific code.
     * */

/**
 * into three main subsystems:
 *
 * 1. ClassLoader Subsystem - loads class file , links. and initializes
 * 2. Runtime Data Area - The Runtime Data Area is divided into five major components:
 *                         Method Area – All the class-level data will be stored here, including static variables.
 *                                       There is only one method area per JVM, and it is a shared resource.
 *                         Heap Area – All the Objects and their corresponding instance variables and
 *                                     arrays will be stored here. There is also one Heap Area per JVM.
 *                         Stack Area – For every thread, a separate runtime stack will be created. For every method call,
 *                                      one entry will be made in the stack memory which is called Stack Frame.
 *                         PC Registers – Each thread will have separate PC Registers, to hold the address of current executing
 *                                        instruction once the instruction is executed the PC register will
 *                                        be updated with the next instruction.
 *
 * 3. Execution Engine -  The bytecode, which is assigned to the Runtime Data Area, will be executed by the Execution Engine.
 *                        The Execution Engine reads the bytecode and executes it piece by piece.
 *
 *                       Interpreter -  The interpreter interprets the bytecode faster but executes slowly. The disadvantage of the interpreter is that when one method is called multiple times,
 *                                       every time a new interpretation is required.
 *
 *                       JIT Compiler - The JIT Compiler neutralizes the disadvantage of the interpreter.
 *
 *
 *                       Garbage Collector -Collects and removes unreferenced objects. Garbage Collection can be triggered by calling System.gc()
 *
 * */
}
