package k_diffrence_between_methodoverloading_and_methodoverriding;

import java.io.IOException;

/**
 * Created by Rishabh on 13/01/2018.
 */
public class b_check_valid_or_not {


    public void m1(int x) throws IOException {
    }


}

class child {

    //   public void m1(int i) {}//valid cause its method overriding

//public static  int m1(long i){return 10;}       //valid cause its overloading


//public static void m1(int x){}//RUN TIME ERROR cause static to non static not allowed


    public void m1(int x) throws Exception {
    }//RUN TIME ERROR cause checkd to checked


    // public static abstract void m1(int x){}    its not allowed of static abstract

}