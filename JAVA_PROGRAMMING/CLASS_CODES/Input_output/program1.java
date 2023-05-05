
/*
   input output using the java scanner class..

 */
import java.util.Scanner;

class scannerDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // For integer value
        System.out.println("Enter the value of x(int): ");
        int x = sc.nextInt();

        // For Float value
        System.out.println("Enter the value of y(float) :");
        float y = sc.nextFloat();

        // For Double value
        System.out.println("Enter the value of z(Double) :");
        double z = sc.nextDouble();

        // For string value
        System.out.println("Enter the Name :");
        String str = sc.next();

        System.out.println("Value of x = "+ x);
        System.out.println("Value of y = "+ y);
        System.out.println("Value of z = "+ z);
        System.out.println("Name is "+str);
    }
}