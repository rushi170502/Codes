
// we cannot access non static things from the static context
import java.util.*;

class methodDemo{

    int x = 10;
    static int y = 20;
    public static void main(String[] args) {
        //System.out.println("X  = "+x);
        System.out.println("Y  = "+y);
        fun();
    }
    static void fun(){
        System.out.println("X  = "+x);// error:  we cannot access this variable because it is not static
                                        // only static variable can access
        System.out.println("Y  = "+y);
    }
}