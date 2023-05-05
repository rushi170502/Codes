
// Armstrong Number.
//
// num = 153
//
// cube of single digit and then sum 
// if sum is equal to actual number 
//
// i/p : num = 153 
// o/p: Armstrong number.( 1*1*1 + 5*5*5 + 3*3*3)
// 			 (1+125+27 = 1

class Demo{
	
	public static void main(String[] args){

		int num = 8208;
		int temp = num;
		int sum = 0;
		int count = 0;

	while(num != 0){	
		while(num != 0){

			int rem = num % 10;
			count++;
			num = num / 10;
		}

		sum = sum + 

	}

		if(sum == temp)
			System.out.println(temp+ " is a Armstrong Number");
		else
			System.out.println(temp+ " is not a Armstrong number");


	}
}
