
// Use of simple methods in java
import java.util.*;
import java.io.*;

class methodDemo{
    public static void main(String[] args) {
        System.out.println("In main method..");
        fun();
        gun();
    }
    // this static function can directly access/call by main method
    static void fun(){
        System.out.println("In fun method");
    }
     // Non static function which cannot directly access through main method..
    void gun(){
        System.out.println("In fun method");
    }
}

// Error : non-static method cannot can be refereced from the static context

