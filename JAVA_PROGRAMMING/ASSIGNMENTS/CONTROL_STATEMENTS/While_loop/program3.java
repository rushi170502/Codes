
// WAP to count the digits in a given number....


class While{

	public static void main(String[] args){

		int num = -1;

		int count = 0;

		while(num != 0){

			count++;
			num /= 10;
		}

		System.out.println("Count of digits : "+count);

	}
}
