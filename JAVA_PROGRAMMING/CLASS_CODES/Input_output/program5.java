// use both  InputStreamReader clss with BufferedReader class

import java.io.*;
class inputstream{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Enter the Society name  :  ");
        String str = br.readLine();

        System.out.println("Enter the wing name :  ");
        char wing = (char)br.read();  // method to take character
        // to skip one character from the InputStreamReader
        br.skip(2);
        System.out.println("Enter the Flat no :  ");// if we don't use skip method not used it gives error : to this line beacause the
                                                     //   char is taken the next method which is \n which
                                                    //  cannot be converted to number so
                                                    // error is  : NumberFormatException
        int flat_no = Integer.parseInt(br.readLine());

        System.out.println("Society Name     : "+str);
        System.out.println("Wing name        : "+wing);
        System.out.println("Flat no          : "+flat_no);
    }


}