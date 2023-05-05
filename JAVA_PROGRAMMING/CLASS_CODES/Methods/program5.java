
// passing arguments to the function
import java.io.*;
class methodDemo {

    void fun1(int x) {
        System.out.println("value = " + x);
    }

    void fun2(float x) {

        System.out.println("value = " + x);

    }

    void fun3(char x) {

        System.out.println("value = " +x);
    }

    public static void main(String[] args) {

        methodDemo obj = new methodDemo();

        System.out.println(" start main  ");
        // function 1 for passing integer value
        obj.fun1(10);
        // function 2 for passing float value
        obj.fun2(45.5f);
        // function 3 for passing char value
        obj.fun3('A');

    }
}

