
// we cannot access non static things from the static context
// but we have option to access that things by creating an object of that class

import java.util.*;

class methodDemo{

    int x = 10;
    static int y = 20;
    public static void main(String[] args) {
       // creating an object of that class
       methodDemo obj = new methodDemo();

        System.out.println("X  = "+obj.x);
        System.out.println("Y  = "+y);

       obj.fun();// call function using object
    }
   void fun(){
        System.out.println("X  = "+x);
        System.out.println("Y  = "+y);
    }
}