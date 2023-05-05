
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

        System.out.println(arr1[1][1]);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1);

    }
}
/*
 * It gives addresses arr[0], arr[1], and arr[2]
 * it says that individual single array are created at heap section
 */