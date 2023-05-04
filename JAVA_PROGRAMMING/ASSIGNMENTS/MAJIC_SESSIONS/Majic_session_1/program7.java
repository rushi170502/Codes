import java.io.*;
class Demo{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows");
        int row = Integer.parseInt(br.readLine());

        int num = (row * (row+1))/2;
        char ch = (char)(64+num);

        if(row%2 != 0) {
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % 2 == 1) {
                        System.out.print(ch + "  ");
                    } else {
                        System.out.print(num + "  ");
                    }
                    ch--;
                    num--;
                }
                System.out.println();
            }
        }else{
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % 2 == 0) {
                        System.out.print(ch + "  ");
                    } else {
                        System.out.print(num + "  ");
                    }
                    ch--;
                    num--;
                }
                System.out.println();
            }
        }
    }
}