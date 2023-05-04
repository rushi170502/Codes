
// WAP to if the given number is even then print the reverse order of number.
// i/p : 6 
// o/p : 6 5 4 3 2 1
//
// if number is odd then print in reverse order by difference 2 
// i/p : 7
// o/p : 7 5 3 1 

class While{

	public static void main(String[] args){

		int num = 7;

		if(num % 2 == 0){

			while(num != 0){
				System.out.print(" "+num);
				num--;
			}
		}else{

			while(num >= 0){
				System.out.print(" "+num);
				num = num - 2;
			}
		}

		System.out.println("");
	}
}
