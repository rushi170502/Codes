
import  java.util.Scanner;

class scannerDemo{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your Dream company : ");
        String c_name = obj.next();

        System.out.println("Enter the expected pacakage  : ");
        int pack = obj.nextInt();

        System.out.println("Dream company is  "+c_name);
        System.out.println("Expected package is "+pack+"  lakh");
    }
}