/**
 * which stops the current executing thread
 * and give a chance to other thread
 * eg. -> bigger task can be stop if smaller task come.
 * Working - Interntally it uses sleep() from java 6 provides hint that i can stop
 *           if accept than stops else continue
 */
public class h_yieldMethod {
    // if native method then kisi or language main iska implementation
    // cant assure behaviour becuse it depends on thread schedular

}
