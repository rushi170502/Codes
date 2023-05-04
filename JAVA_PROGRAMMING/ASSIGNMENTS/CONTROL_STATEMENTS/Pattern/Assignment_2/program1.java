/*
        WAP to print the following pattern

        C2W
        C2W C2W 
        C2W C2W C2W
        C2W C2W C2W C2W   
 */




class pattern{
    public static void main(String[] args) {
        int num = 4;
        for(int i = 1; i <= num;i++){
            for(int j = 1; j <= i; j++){
            System.out.print("C2W\t");
            }
            System.out.println();
        }
    }
}