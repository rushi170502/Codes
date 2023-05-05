package string;

class Demo{
    public static void main(String[] args) {
        
        char str[] = {'A','B','C'};

        System.out.println(str);

        System.out.println("String is : " + str); // here string is concat with other string so it returns address
                                                 // it internally calls toString() function
        
    }
}