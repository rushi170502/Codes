
// WAP to count the odd digits in given 
//

class While{

	public static void main(String[] args){

		int num = 98755623;
		int count = 0;

		while(num != 0){

			int rem = num % 10;

			if(rem % 2 == 1)
				count++;


			num /= 10;
		}

		System.out.println("ODD digit count is :  "+count);
	}
}
