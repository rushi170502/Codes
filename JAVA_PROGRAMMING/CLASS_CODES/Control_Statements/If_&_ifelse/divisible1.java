
// WAP to check the given number is divisible by 3 & 5
// if num is divisible by 3 then print FIZZ
// if num is divisible by 5 then print BUZZ
// if num is divisible by 3 & 5 then print FIZZ - BUZZ
//if num is not divisble by both then print not divisible by both...

class Demo{

	public static void main(String[] args){

		int num = 15;

		if( num % 3 == 0 && num % 5 == 0)
			System.out.println("FIZZ-BUZZ");
		else if(num % 3 == 0)
			System.out.println("FIZZ");
		else if( num % 5 == 0)
			System.out.println("BUZZ");
		else
			System.out.println("Not divisible by both");
	}

}
