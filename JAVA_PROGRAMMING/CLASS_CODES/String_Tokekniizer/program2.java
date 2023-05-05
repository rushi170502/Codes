
import java.util.*;
import java.io.*;

class StringDemo{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the society name, wing and flat no : :");
        String info = br.readLine();

        StringTokenizer st  =  new StringTokenizer(info, ",);

        String token1 = st.nextToken();
        String token2 = st.nextToken();
        int token3 = Integer.parseInt(st.nextToken());

        System.out.println("Society name : "+token1);
        System.out.println("Wing         : "+token2);
        System.out.println("Flat no      : "+token3);



    }
}