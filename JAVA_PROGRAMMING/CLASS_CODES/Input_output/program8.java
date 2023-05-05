
import java.io.*;

class inputstream{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the player name, jersey number and its average   :");
        String info = br.readLine();
        System.out.println(info);// here it only print on one line we need to format it
    }

}