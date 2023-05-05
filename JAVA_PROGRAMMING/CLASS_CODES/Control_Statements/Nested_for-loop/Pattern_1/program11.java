// WAP a program to print following pattern
//
//     	a  
//     	b  c
//     	d  e  f

class pattern{

	public static void main(String[] args){

		int n = 3 ;
		char ch = 'a';
		for(int i= 1; i <= 3 ;i++){ // represents rows

			for(int j = 1; j<=i; j++){// represents columns

				System.out.print(ch+"   ");
				ch++;
			}
			
			System.out.println();
		}

		System.out.println();
	}
}
