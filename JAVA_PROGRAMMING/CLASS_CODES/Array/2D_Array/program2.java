
class ArrayDemo{
    public static void main(String[] args) {
        int arr1[][] = new int[3][3];
        // initialize values to array
        arr1[0][0]= 10;
        arr1[0][1]= 20;
        arr1[0][2]= 30;
        arr1[1][0]= 40;
        arr1[1][1]= 50;
        arr1[1][2]= 60;
        arr1[2][0]= 70;
        arr1[2][1]= 80;
        arr1[2][2]= 90;

        for(int i=0; i< arr1.length ; i++){
            for(int j=0; j< arr1.length;j++){
                System.out.print(arr1[i][j] + "\t");
            }
               System.out.println(); 
        }
    }
}

// if we print the array length then it gives a length of the array rows
// in this int arr[3][2] :  length of the array is 3