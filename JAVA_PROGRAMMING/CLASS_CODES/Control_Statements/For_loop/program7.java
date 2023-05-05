
// Perfect number..
// it is sum of factors other than itself is same as the given num then we call
// it is a perfect number..
// i/p : num = 6
//      factors = 1 2 3 6
// o/p : 1+2+3 = 6 [6]
//

class Demo{

	public static void main(String[] args){

		int num = 6;

		int sum = 0;

		for(int i = 1; i< num; i++){
			if(num % i == 0)

				sum = sum + i;
		}

		if(sum == num)
			System.out.println(num+ "  is perfect number");
		else
			System.out.println(num +"  is not perfect number");
	}
}
