// WAP a program to print following pattern
//
//       1   1   1  
//       1   1   1 
//       1   1   1


class pattern{

	public static void main(String[] args){

		int n = 3 ;

		for(int i= 1; i <= 3 ;i++){ // represents rows

			for(int j = 1; j<=n; j++){// represents columns

				System.out.print("1  ");
			}

			System.out.println();
		}

		System.out.println();
	}
}
