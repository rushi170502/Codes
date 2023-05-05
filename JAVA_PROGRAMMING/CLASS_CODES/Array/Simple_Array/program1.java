
class arrayDemo{
        public static void main(String[]args){
        // Array initialization
        // Way 1

        int arr[]=new int[5]; // it creates array of 5 elements and initialize default to 0;

        System.out.println("Array 1 elements : ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // Way 2

        int arr2[]={10,20,30,40,50}; // it creates array of 5 elements and initialize values to array with initializer list
        System.out.println("Array 2 elements : ");
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        System.out.println(arr2[4]);

        // Way 3

        int arr3[]=new int[]{100,200,300,400,500};// it creates array of 5 elements and initialize values to array with initializer list

        System.out.println("Array 3 elements : ");
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println(arr3[3]);
        System.out.println(arr3[4]);

        // Wrong way of array declaration

        // int arr4[]=new int[5]{11,22,33,44,55};  error for this statement baecause this type of declaration is not valid
        //it says that only give the dimensions or initializer list both are not accepected
        }

}