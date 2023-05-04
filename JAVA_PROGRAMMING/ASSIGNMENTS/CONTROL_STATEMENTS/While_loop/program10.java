
// WAP to check whether given number is palindrome or not::
// i/p : 12321 
// o/p: Palindrome
//
// i/p: 1253
// o/p : Not Palindrome

class While{

	public static void main(String[] args){

		int num = 2321;
		int temp = num;
		int rev= 0;
		while(num != 0){

			int rem = num % 10;
			rev = rev * 10 + rem;

			num /= 10;
		}
		if(temp == rev)
			System.out.println(temp +" is Palindrome");
		else
			System.out.println(temp + "is not Palindrome");
	}
}
