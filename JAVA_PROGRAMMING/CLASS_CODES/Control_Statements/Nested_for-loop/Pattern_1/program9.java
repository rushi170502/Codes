// WAP a program to print following pattern
//
//       	A  B  C
//       	D  E  F
//       	G  H  I
//       	J  K  L
//       


class pattern{

	public static void main(String[] args){

		int n = 3 ;
		char ch = 'A';
		for(int i= 1; i <= 4 ;i++){ // represents rows

			for(int j = 1; j<=n; j++){// represents columns

				System.out.print(ch+"   ");
				ch++;
			}
			
			System.out.println();
		}

		System.out.println();
	}
}
