// WAP a program to print following pattern
//
//       2   4   6
//       8   10  12
//       14  16  18


class pattern{

	public static void main(String[] args){

		int n = 2;

		for(int i= 1; i <= 3;i++){

			for(int j = 1; j<=3; j++){
					
				System.out.print(n+"   ");
				n = n + 2;

			}

			System.out.println();
		}

		System.out.println();
	}
}
