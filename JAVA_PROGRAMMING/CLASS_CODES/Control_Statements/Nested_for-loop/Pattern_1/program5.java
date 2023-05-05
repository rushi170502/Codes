// WAP a program to print following pattern
//
//       1   1   1
//       2   2   2
//       3   3   3
//       4   4   4
//       


class pattern{

	public static void main(String[] args){

		int n = 3 ;

		for(int i= 1; i <= 4 ;i++){ // represents rows

			for(int j = 1; j<=n; j++){// represents columns

				System.out.print(i+"   ");
			}

			System.out.println();
		}

		System.out.println();
	}
}
