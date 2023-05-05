package string;

// simple string class use

class Demo{

    public static void main(String[] args) {
        
        // String declaration methods

        // 1st method
        String str = "Core2Web";

        // 2nd method
        String str1 = new String("Core2Web");

        // 3rd method
        char  str2[] = {'R','u','s','h','i'};

        // 4th method  
        char arr[] = {'C','2','W'};
        String str3 = new String(arr);

        String str4 = "Core2Web";

        System.out.println(str); // core2Web store at SCP
        System.out.println(str1); // Core2Web store at heap
        System.out.println(str2); // Rushi store at heap
        System.out.println(str3); // store at heap and store addresss from integer cache
        System.out.println(str4); // store at SCP 

        System.out.println(System.identityHashCode(str)); // 
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4)); // uniue id same as str beacuse both store at SCP
        
        //System.out.println(System.identityHashCode(str3));

    }
}
