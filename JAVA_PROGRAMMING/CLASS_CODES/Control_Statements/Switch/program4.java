/*
 bere we canot use the duplicate case because
 we use character is constant value so it gives error
 */

class switchDemo{
    public static void main(String[] args) {
        int ch = 65;
        switch(ch){
            case 65:
                System.out.println("one");
                break;
            case 'A':
                System.out.println("Two");// error: duplicate case label
                break;
            case 66:
                System.out.println("Three");
                break;
            case 'B':
                System.out.println("Four");// error: duplicate case label
                break;

            default:
                System.out.println("No Match..");
        }
    }


}