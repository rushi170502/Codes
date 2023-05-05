/*

 here we use string to the case it accpected by the jvm
 but it cannot supported still 1.5
 after 1.6 the string is supported to the switch case

 */

class switchDemo{
    public static void main(String[] args) {
        String str1 = "Tue";

        switch (str1){
            case "Mon" :
                System.out.println("Monday");
                break;
            case "Tue" :
                System.out.println("Tuesday");
                break;
            case "Wed" :
                System.out.println("Wednesday");
                break;
            case "Thu" :
                System.out.println("Thursday");
                break;
            case "Fri" :
                System.out.println("Friday");
                break;
            case "Sat" :
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");

        }
    }
}