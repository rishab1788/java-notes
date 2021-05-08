package o_solid;

/**
 * larger interfaces should be split into smaller ones. By doing so,
 * we can ensure that implementing classes only need to be concerned about
 * the methods that are of interest to them.*/
public class E_InterfaceSegregation {
}
/**
 *we're going to try our hands as zookeepers. And more specifically, we'll be working in the bear enclosure.
 * public interface BearKeeper {
 *     void washTheBear();
 *     void feedTheBear();
 *     void petTheBear();
 * }
 * */

/**
 * As avid zookeepers, we're more than happy to wash and feed our beloved bears. However, we're all too aware of the dangers of petting them. Unfortunately,
our interface is rather large, and we have no choice than to implement the code to pet the bear.*/

interface BearCleaner {
    void washTheBear();
}

interface BearFeeder {
    void feedTheBear();
}

interface BearPetter {
    void petTheBear();
}

//Now, thanks to interface segregation, we're free to implement only the methods that matter to us
class BearCarer implements BearCleaner, BearFeeder {

    public void washTheBear() {
        //I think we missed a spot...
    }

    public void feedTheBear() {
        //Tuna Tuesdays...
    }
}
// And finally, we can leave the dangerous stuff to the crazy people:
class CrazyPerson implements BearPetter {

    public void petTheBear() {
        //Good luck with that!
    }
}