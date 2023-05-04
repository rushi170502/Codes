/*
        WAP to print the following pattern

     3C   3C   3C   3C
     3C   3C   3C
     3C   3C
     3C

 */

class pattern {
    public static void main(String[] args) {
        int row = 4;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row + 1 - i; j++) {
                System.out.print("3C\t");
            }
            System.out.println();
        }
    }
}