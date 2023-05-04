
// WAP to print the reverse the given number.
//
class While{

	public static void main(String[] args){

		int num = 942111423;
		int rev= 0;
		while(num != 0){

			int rem = num % 10;
			rev = rev * 10 + rem;

			num /= 10;
		}

		System.out.println("Reverse is :  "+ rev);
	}
}
