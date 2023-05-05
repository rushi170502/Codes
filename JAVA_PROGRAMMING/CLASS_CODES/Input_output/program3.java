// use both  InputStreamReader clss with BufferedReader class

import java.io.*;

class inputstream{
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in) ;
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the name  :  ");
        String str = br.readLine();

        System.out.println("Enter the Roll no  :  ");
        int roll_no = Integer.parseInt(br.readLine());

        System.out.println("Enter the Marks Average  :  ");
        float avg = Float.parseFloat(br.readLine());// use of wrapper class

        System.out.println("Name     : "+str);
        System.out.println("Roll_no  : "+roll_no);
        System.out.println("Average  : "+avg);
    }


}