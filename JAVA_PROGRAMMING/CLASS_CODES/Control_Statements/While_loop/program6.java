
// WAP to print the single digits of given number..

class Demo{

	public static void main(String[] args){

		int num = 23456;

		System.out.println("Given number is : "+num);
		while(num != 0){

			System.out.println(num % 10);
			num /= 10;
		}
	}
		
}
