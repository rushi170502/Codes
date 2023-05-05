
// WAP to print reverse number of given number..
// i/p : 6541
// o/p : 1456

class Demo{

	public static void main(String[] args){

		int num = 6541;

		while(num != 0){

			int rem = num %10;
			System.out.print(rem);
			num /= 10;
		}
		System.out.println();
	}

}
