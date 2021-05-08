package i_overridin_method;

import com.sun.deploy.security.ruleset.Rule;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;

/**
 * Created by Rishabh on 09/01/2018.
 */
class b_rules_for_overriding {

    private Class Rule1 //COVAIENT

    { //coverient return type can ve usedto overrid method from 1.4 version
        //from 1.5 version covarient return type need not be same as its child type also allowed

        class p {
            public Object m1() {
                return null;
            }

        }

        class c {
            public String m1() {
                return null;
            }

        }

    }

    class rule2 {
//parent class private method not available to the child that means overiridng is not allowed with private method

        class p {
            private Object m1() {
                return null;
            }

        }

        class c {
            private String m1() {
                return null;
            }//not overriding

        }
    }


    class rule3 {

        //if we use final keyword to method than it cant we be override
//COMPILE TIME ERROR WILL ARISE  m1 cannot override
        class p {
            public final Object m1() {
                return null;
            }

        }

        class c extends p{
            public String m1() {
                return null;
            }

        }


    }


    class rule4 {


        //parent class abstract method we should override in child class to proivde implmentation
        //

        abstract class p {
            public abstract void m1();
        }

        class c extends p {
            public void m1() {

            }
        }

//valid no problem at all

    }

    class rule5 {
//while overriding we cant reduce the scope of access modifier but we can increase the scope of access modifier

//PRIVATE<PROTECTED<default<public
        //CASE1
//its not allowed cause we have weaker parent class than child

        class p {
            public void m1() {

            }

        }

        class c extends p{
            void m1()
            {

            }

        }

//CASE2-
        //its allowed cause we are giving weaker to stronger

        class pa {
            void m1() {

            }

        }

        class ch extends pa {
            public void m1()

            {

            }

        }
//CASE 3-
        //      its allowed cause protected is bigger than default

        class paa {
            protected void m1() {

            }

        }

        class cha {
            void m1()

            {

            }

        }


    }


    class rule6 {
        //checked exception  and unchecked exception

        //there are no restriction in the unchecked exception
        //if child class method throws any checked exception compulsory parent class should throw same checked exception
        //other wise we will get CE error


        Class p

        {
            public void m1() throws IOException
            {
            }


        }

        class C extends p {
            public void m1() throws EOFException, InterruptedIOException {
            }
        }


        //and checked exexption in parent method should have child methods child exexxption


    }


    class rule7 {
        // we cant override static method as non static otherewise we will get CE error

        class Pa1 {
            static void m1() {
            }
        }

        class c extends Pa1 {
            public static void m1() {

            }


            // if we try to do this type of overriding than we will get CE

            class Pa {
                public void m1() {
                }
            }

            class ca extends Pa {
                public static void m1() {

                }

                // if we try to make both method as static than its okey but its not overrriding its method hiding
                class Paa {
                    public static void m1() {
                    }
                }

                class caa extends Paa {
                    public static void m1() {

                    }

                }


            }

        }