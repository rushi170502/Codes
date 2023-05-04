import java.io.*;
class Demo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Lower limit  :  ");
        int start = Integer.parseInt(br.readLine());
        System.out.println("Enter the Higher limit  :  ");
        int end = Integer.parseInt(br.readLine());

        for(int i = start ; i <= end; i++){
            for(int j = 1; j * j <= i; j++) {
                if(j * j * j == i)
                    System.out.print("\t" + i);
            }
        }
        System.out.println();
    }

}