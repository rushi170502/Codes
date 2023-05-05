
import java.io.*;
import java.util.*;

class StringDemo{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the player name , player grade, player runs & player strike rate : : ");
        String info = br.readLine();

        // String tokenizer class
        StringTokenizer st = new StringTokenizer(info," ");

        String token1 = st.nextToken();
        String token2 = st.nextToken();
        int token3 = Integer.parseInt(st.nextToken());
        float token4 = Float.parseFloat(st.nextToken());

        System.out.println("Player name :  "+token1);
        System.out.println("Player grade :  "+token2);
        System.out.println("Player runs :  "+token3);
        System.out.println("Player strike rate :  "+token4);

    }
}