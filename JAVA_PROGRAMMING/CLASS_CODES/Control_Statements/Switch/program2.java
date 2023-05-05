class switchDemo{
    public static void main(String[] args) {
        int x = 5;
        switch(x){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 5:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");// given error :  duplicate case label..
                break;
            default:
                System.out.println("No Match..");
        }
    }


}