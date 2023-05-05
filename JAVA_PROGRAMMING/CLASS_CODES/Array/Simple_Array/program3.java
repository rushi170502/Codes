
// accessing elements from array using for loop

class arrayDemo{
    public static void main(String[] args) {
        // create integer array
        int arr[] = new int[5];
        arr[0] = 10;
        arr[3] = 20;
        arr[4] = 30;
        // it creates array as  10 0 0 20 30
        // automatically set values to 0 for int
        System.out.println("Integer Array elements : ");
        for (int i = 0; i < 5; i++){
            System.out.print("    "+arr[i]);
        }
        System.out.println();
        // float array
        float arr1[] = new float[5];
        arr1[0] = 11.34f;
        arr1[1] = 33.56f;
        arr1[2] = 55.67f;
        // it creates as 11.34  33.56  55.67  0.0  0.0
        // automatically set values to 0.0 for float
        System.out.println("float Array elements : ");
        for (int i = 0; i < 5; i++){
            System.out.print("    "+arr1[i]);
        }
        System.out.println();
        // character array
        char carr[] = new char[5];
        carr[0] = 'A';
        carr[2] = 'B';
        carr[4] = 'C';
        // it creates as A    B    C
        // automatically set values to blank space
        System.out.println("character Array elements : ");
        for (int i = 0; i < 5; i++){
            System.out.print(""+carr[i]);
        }
        System.out.println();
        // boolean value

        boolean barr[] = new boolean[5];
        barr[0] = true;
        barr[1] = true;
        // it creates as true true false false false
        // automatically set values false value to boolean array

        System.out.println("boolean Array elements : ");
        for (int i = 0; i < 5; i++){
            System.out.print("    "+barr[i]);
        }


    }
}