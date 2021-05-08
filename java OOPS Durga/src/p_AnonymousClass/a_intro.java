package p_AnonymousClass;

/**
 * It is an inner class without a name and for which only a single object is created.
 * An anonymous inner class can be useful when making an instance of an object with certain
 * “extras” such as overloading methods of a class or interface, without having to actually subclass a class.
 * (i). with out having name class.
 * (ii). sometimes we declare inner class withoutname.
 * (iii).Just for instant use or one time use.
 */

public class a_intro {


    /* IN JAVA we have Anonymous Array and class
    // anonymous int array
new int[] { 1, 2, 3, 4};

// anonymous char array
new char[] {'x', 'y', 'z');

// anonymous String array
new String[] {"Geeks", "for", "Geeks"};

// anonymous multidimensional array
new int[][] { {10, 20}, {30, 40, 50} };
    * */

/*


 Anonymous inner class are mainly created in two ways:

Class (may be abstract or concrete)
Interface

*/


}


// concept of anonymous array
class AnonymousArrayExample {
    public static void main(String[] args) {
        // anonymous array
        sum(new int[]{1, 2, 3});
    }

    public static void sum(int[] a) {
        int total = 0;
        // using for-each loop
        for (int i : a)
            total = total + i;
        System.out.println("The sum is:" + total);
    }
}
