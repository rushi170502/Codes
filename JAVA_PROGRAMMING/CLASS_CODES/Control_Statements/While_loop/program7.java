class Demo{

	public static void main(String[] args){

		int num = 4356;

		int sum =0;
		int mul = 1;

		while(num != 0){

			int rem = num % 10;
			sum = sum + rem;
			mul = mul * rem;
			num /= 10;

		}
		System.out.println("sum = "+sum);
		System.out.println("mul = "+mul);
	}
}
