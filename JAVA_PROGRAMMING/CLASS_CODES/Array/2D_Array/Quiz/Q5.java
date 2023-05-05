class quiz{
    public static void main(String[] args) {
        int arr[][] = new int [2][2] { {1,2},{3,4},{5,6},{} };
        
        System.out.println(arr.length);

        }
}

/*
 * Answer :  Error :
 *          Compile time error :
 *      array creation with both dimension expression and initialization is illegal
        int arr[][] = new int [2][2] { {1,2},{3,4},{5,6},{} };
 */