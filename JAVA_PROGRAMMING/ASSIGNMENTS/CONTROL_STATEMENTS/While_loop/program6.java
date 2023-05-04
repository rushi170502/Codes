
// WAP to sum of even numbers and multiplication of odd numbers between 1 to 20;


class While{

	public static void main(String[] args){

		int num = 10;
		int i = 1;	
		int sum = 0 , mul = 1;
		while( i <= num){

			if(i % 2 == 0)
			 	sum = sum + i;
			else
				mul = mul * i;

			i++;
		}

		System.out.println("Sum is : "+sum);
		System.out.println("Multiplication is :  "+mul);
	}
}
