
import java.util.*;

class StringDemo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the player name , player grade, player runs & player strike rate : : ");
        String info = sc.nextLine();

        StringTokenizer st = new StringTokenizer(info," ");
        System.out.println(st.countTokens());

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}