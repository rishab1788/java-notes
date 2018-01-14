package i_overridin_method;

/**
 * Created by Rishabh on 12/01/2018.
 */
public class c_overriding_for_datamembers {
//overriding doesnot exsist for data memebers,
    //

    class parent {
        int x = 888;
    }

    class child extends parent {
        int x = 999;
    }

    class test {
        public void main(String... args) {
            parent p = new parent();
            System.out.print(p.x);
            child c = new child();
            System.out.print(c.x);
            parent p1 = new child();

            System.out.print(p1.x);


        }

    }
}
