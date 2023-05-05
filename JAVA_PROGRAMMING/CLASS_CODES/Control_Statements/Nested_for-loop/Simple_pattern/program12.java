// WAP a program to print following pattern
//
//          1   3   5
//          7   9   11
//          13  15  17


class pattern{

	public static void main(String[] args){

		int n = 1;

		for(int i= 1; i <= 3;i++){

			for(int j = 1; j<=5; j++){
					
				System.out.print(n+"   ");

			}

			System.out.println();
		}

		System.out.println();
	}
}
