package string;


class Demo{
    public static void main(String[] args) {
        
        String str1 = "Rushi"; // scp
        String str2 = "Rushi"; // scp
        String str3 = new String("Rushi"); // new object at heap 
        String str4 = new String("Rushi"); // new object at heap 
        String str5 = new String("Vinit"); //new object at heap (vinit)
        String str6 = "Vinit"; // SCP

        System.out.println(System.identityHashCode(str1)); // same hashcode as str2
        System.out.println(System.identityHashCode(str2)); // same hashcode as str1
        System.out.println(System.identityHashCode(str3)); // different hashcode 
        System.out.println(System.identityHashCode(str4)); // different hashcode
        System.out.println(System.identityHashCode(str5)); // different hashcode for vinit
        System.out.println(System.identityHashCode(str6)); // different hashcode for vinit
        
    }
}