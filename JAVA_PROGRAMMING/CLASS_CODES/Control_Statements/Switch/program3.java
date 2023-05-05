/*
 bere we canot use the duplicate case because
 1+1 = 2 is constant value so it gives error
 */

class switchDemo{
    public static void main(String[] args) {
        int x = 2;
        switch(x){
            case 1:
                System.out.println("one");
                break;
            case 1+1:
                System.out.println("Two");
                break;
            case 2:
                System.out.println("Three");// error: duplicate case label
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("No Match..");
        }
    }


}