public class InterviewQuestion {

}

/**
 * 1. Interface */
interface a
{
    interface b {

        interface c {
public int  ru();
        }
    }
}
class z implements a.b.c {
    a.b.c cc = new z();
    @Override
    public int ru(){
        return 0;
    }
}