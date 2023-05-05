package string;

class Demo{
    public static void main(String[] args) {
        
        String str1 = "Rushikesh";  

        //String str2 = "Birari";
        int temp  = 0 ;
        String rev = " "; 
        for(int i = str1.length(); i>= 0; i--){

            if(temp < i){
                int ch = str1.charAt(i);
                rev = ch + rev;
            }
            temp++;
        }
        System.out.println(rev);
            
    
        
    }
}