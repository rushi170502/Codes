/*
        WAP to print the following pattern

     10    10    10    10
     11    11    11
     12    12
     13
     
*/

class pattern {
    public static void main(String[] args) {
        int row = 4;
        int num = 10;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row + 1 - i; j++) {
                System.out.print(num + "\t");
            }
            num++;
            System.out.println();
        }
    }
}