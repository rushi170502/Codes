
import java.io.*;

class ArrayDemo{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array  :");
        int size = Integer.parseInt(br.readLine());
        char carr[] = new char[size];

        System.out.println("Enter the elements of character array : ");
        for(int i = 0;i < carr.length; i++){
            carr[i] = (char)br.read();
            br.skip(2);

        }
        for(int i = 0; i < carr.length ; i++) {
            if (carr[i] == 'a' || carr[i] == 'A' || carr[i] == 'e' || carr[i] == 'E' || carr[i] == 'i' || carr[i] == 'I' || carr[i] == 'o' || carr[i] == 'O' || carr[i] == 'u' || carr[i] == 'U') {
                System.out.print("\t" + carr[i]);
            }
        }
    }
}