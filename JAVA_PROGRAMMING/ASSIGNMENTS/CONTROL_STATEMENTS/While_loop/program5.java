
// WAP to square of even digits in a number..


class While{

	public static void main(String[] args){

		int num = 987565423;
	
		while(num != 0){

			int rem = num % 10;

			if(rem % 2 == 0)
			System.out.println(rem * rem);

			num /= 10;
		}

	}
}
