/*
        WAP to print the following pattern

    1    2    3    4
    4    5    6
    6    7
    7

 */

class pattern {
    public static void main(String[] args) {
        int row = 4;
        int num = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row + 1 - i; j++) {
                System.out.print(num++ + "\t");
            }
            num--;
            System.out.println();
        }
    }
}