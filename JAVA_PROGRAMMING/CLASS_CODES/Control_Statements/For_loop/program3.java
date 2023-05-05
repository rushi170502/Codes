// WAP to find the factorial of a given number..
//

class Demo{

	public static void main(String[] args){

		int num = 5;
		int fact = 1;

		for(int i = 1; i <= num; i++){

			fact = fact * i;
		}
		System.out.println("factorial is :"+fact);
	}
}
