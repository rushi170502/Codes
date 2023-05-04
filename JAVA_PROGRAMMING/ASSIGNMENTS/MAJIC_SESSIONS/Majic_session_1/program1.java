
// PROGRAM 1:
import java.io.*;
class Demo{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows");
        int row = Integer.parseInt(br.readLine());
        int num = row;
        char ch = (char)(64+row);
        for (int i=1; i<=row;i++){
            for (int j = 1; j<=row;j++){
                if(i%2 == 1){
                    System.out.print(ch-- +""+ num-- +"  ");
                }else {
                    System.out.print(++ch +""+ ++num+"  ");
                }
            }
            System.out.println();
        }
    }
}