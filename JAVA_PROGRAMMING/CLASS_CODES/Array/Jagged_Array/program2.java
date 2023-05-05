
class ArrayDemo{
    public static void main(String[] args) {
        // jagged array initialization

        int  arr[][] = { { 1,2,3},{4,5},{7}};

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

