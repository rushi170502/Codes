// use both  InputStreamReader clss with BufferedReader class

import java.io.*;

class inputstream{
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Enter the player name  :  ");
        String str = br.readLine();

        System.out.println("Enter the Jersey no  :  ");
        int jer_no = Integer.parseInt(br.readLine());

        System.out.println("Enter the player batting Average  :  ");
        float avg = Float.parseFloat(br.readLine());// use of wrapper class

        System.out.println("Player Name     : "+str);
        System.out.println("Jersey No       : "+jer_no);
        System.out.println("Average         : "+avg);
    }


}