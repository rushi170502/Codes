
// WAP to check the given number is strong number or not

class Demo{

	public static void main(String[] args){

		int num = 142;
		int temp = num;
		int sum = 0;

		while(num != 0){
			int fact =1;

			int rem = num % 10;

			for(int i = 1; i<= rem ;i++){

				fact = fact * i;
			}
			sum = sum + fact;
			num /= 10;
		}
		if(temp == sum)
			System.out.println(temp+" is a Strong Number..");
		else
			System.out.println(temp+" is not Strong Number...");

	}
}
