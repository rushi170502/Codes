/*
 here we cannot use variables for the case because switch says that
 they can need only constant value

 because varaible can change ant time so it gives error
 */

class switchDemo{
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int x = 3;

        switch(x){
            case a:
                System.out.println("1");
                break;
            case b:
                System.out.println("2");
                break;
            case a+b:
                System.out.println("3");
                break;
            case a+a+b:
                System.out.println("1");
                break;
            case b+b+a:
                System.out.println("1");
                break;
        }
    }
}