
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
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
            System.out.println(arr[3]);
            System.out.println(arr[4]);
            // float array
         float arr1[] = new float[5];
            arr1[0] = 11.34f;
            arr1[1] = 33.56f;
            arr1[2] = 55.67f;
            // it creates as 11.34  33.56  55.67  0.0  0.0
            // automatically set values to 0.0 for float
            System.out.println("float Array elements : ");
            System.out.println(arr1[0]);
            System.out.println(arr1[1]);
            System.out.println(arr1[2]);
            System.out.println(arr1[3]);
            System.out.println(arr1[4]);

        // character array
         char carr[] = new char[5];
            carr[0] = 'A';
            carr[1] = 'B';
            carr[2] = 'C';
            // it creates as A  B  C
            // automatically set values to blank space
            System.out.println("character Array elements : ");
            System.out.println(carr[0]);
            System.out.println(carr[1]);
            System.out.println(carr[2]);
            System.out.println(carr[3]);
            System.out.println(carr[4]);

        // boolean value

         boolean barr[] = new boolean[5];
            barr[0] = true;
            barr[1] = true;
            // it creates as true true false false false
            // automatically set values false value to boolean array

            System.out.println("boolean Array elements : ");
            System.out.println(barr[0]);
            System.out.println(barr[1]);
            System.out.println(barr[2]);
            System.out.println(barr[3]);
            System.out.println(barr[4]);


    }
}