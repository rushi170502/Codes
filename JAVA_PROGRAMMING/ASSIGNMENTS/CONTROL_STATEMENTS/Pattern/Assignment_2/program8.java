/*
        WAP to print the following pattern
        J
        I    H
        G    F     E
        D    C     B    A   

 */

class pattern {
    public static void main(String[] args) {
        int row = 5;
        int num = (row * (row + 1)) / 2;
        char ch = (char) (64 + num);
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(ch-- + "\t");
            }
            System.out.println();
        }
    }
}