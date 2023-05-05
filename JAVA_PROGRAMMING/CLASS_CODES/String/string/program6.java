package string;


class Demo{
    public static void main(String[] args) {
        
        String str1 = "Rushi";
        String str2 = "Birari";

        System.out.println(str1 + str2);

        String str3 = "RushiBirari";

        String str4 = str1 + str2;// when two string concatenated that time new string automatically call so its gives different hashcode
        
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
}