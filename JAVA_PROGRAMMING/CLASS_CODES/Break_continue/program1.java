
// WAP to use break statement to check number is prime or not

class Demo{

	public static void main(String[] args){

		int num =157;
		int count = 0;

		int i = 1;
		for( ; i<= num; i++){

			if(num % 1 == 0)
				count++;

			if(count > 2)
				break;

		}

		System.out.println(i);
		if(count == 2)
			System.out.println(num+" is Prime Number..");
		else
			System.out.printf(num+" is not Prime Number");
	}
}
