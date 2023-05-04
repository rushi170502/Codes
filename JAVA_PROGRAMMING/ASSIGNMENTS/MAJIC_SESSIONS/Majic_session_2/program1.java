import java.io.*;
class Demo{
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Lower limit  :  ");
        int start = Integer.parseInt(br.readLine());
        System.out.println("Enter the Higher limit  :  ");
        int end = Integer.parseInt(br.readLine());
        int even_count= 0;
        for(int i = start ; i <= end; i++){
            if(i % 5 == 0){
                if(i % 2 == 0){
                    even_count++ ;
                    System.out.print("\t"+i);
                }
            }
        }
        System.out.println();
        System.out.println("\t"+"Even count = "+even_count);

    }
}