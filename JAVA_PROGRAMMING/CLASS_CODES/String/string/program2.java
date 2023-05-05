package string;

// simple string class use

class Demo{

    public static void main(String[] args) {
        
        // String declaration methods

        // 1st method
        String str = "Core2Web";

        // 2nd method
        String str1 = new String("Core2Web");

        // 3th method  
        char arr[] = {'C','2','W'};
        String str3 = new String(arr);

        int ch = 2;

        System.out.println(str); // core2Web store at SCP
        System.out.println(str1); // Core2Web store at heap
        System.out.println(str3); // store at heap and store addresss from integer cache

        System.out.println(System.identityHashCode(str)); // 
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str3));
        System.out.println("1 index character : "+System.identityHashCode(str3.charAt(1)));// C has different index character hashcode

        System.out.println(System.identityHashCode(ch));//C has different index character hashcode

    }
}
