// use both  InputStreamReader clss with BufferedReader class

import java.io.*;

class inputstream{
    public static void main(String[] args)throws IOException {

        BufferedReader br1 = new BufferedReader (new InputStreamReader(System.in));

        BufferedReader br2 = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Enter the player name  :  ");
        String str = br1.readLine();

        System.out.println("Enter the Jersey no  :  ");
        int jer_no = Integer.parseInt(br1.readLine());

        // close the object of bufferedReader class

        br1.close();// first object is close to the stream keyboard

        // if any object closed the connection between system.in and object then all connection is closed no one can take\
        // i/p from the keyboard

        // try to take i/p using 2nd object
        System.out.println("Enter the player batting Average  :  ");
        float avg = Float.parseFloat(br2.readLine());// use of wrapper class

        System.out.println("Player Name     : "+str);
        System.out.println("Jersey No       : "+jer_no);
        System.out.println("Average         : "+avg);
    }


}