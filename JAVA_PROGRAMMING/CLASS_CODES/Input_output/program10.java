//Use of StringTokenizer..

import java.util.*;
import java.io.*;

class inputstream{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the player name, jersey number and its average   :");
        String info = br.readLine();
        System.out.println(info);// here it only print on one line we need to format it

        // Use of StringTokenizer
        StringTokenizer str = new StringTokenizer(info," ");// it requires two parameteres
        // one is string and other is delimeter(how to seprate string)

        String token1 = str.nextToken();
        String token2 = str.nextToken();
        String token3= str.nextToken();

        System.out.println("Player name  :  "+token1);
        System.out.println("Jersey No    :  "+token2);
        System.out.println("Batting Avg  :  "+token3);

    }

}