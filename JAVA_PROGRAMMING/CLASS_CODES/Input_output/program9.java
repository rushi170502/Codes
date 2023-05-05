//Use of StringTokenizer..

import java.io.*;
import java.util.*;

class inputstream{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the player name, jersey number and its average   :");
        String info = br.readLine();

        // Use of StringTokenizer
        StringTokenizer str = new StringTokenizer(info," ");// it requires two parameteres
                                                            // one is string and other is delimeter(how to seprate string)
        System.out.println("count of tokens is   : "str.countTokens());
        while(str.hasMoreTokens()){
            System.out.println(" "+st.countTokens());
        }
        /*
        System.out.println("Player name  :  "+token1);
        System.out.println("Jersey No    :  "+token2);
        System.out.println("Batting Avg  :  "+token3);

         */

    }

}