



class ArrayDemo{
    public static void main(String[] args) {
        // jagged array initialization

        int  arr[][] = { { 1,2,3},{4,5},{7}};

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;j++){
                System.out.println(arr[i][j]+"\t");
            }
        }
    }
}

/*
 * 1   2   3
 * 4   5   IOException index out of bounds exception
 * 
 */