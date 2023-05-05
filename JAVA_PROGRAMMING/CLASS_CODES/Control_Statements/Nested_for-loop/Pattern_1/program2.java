// WAP a program to print following pattern
//
//          * 	*   *   
//          *   *   * 
//          *   *   *


class pattern{

	public static void main(String[] args){

		int n = 3 ;

		for(int i= 1; i <= n;i++){

			for(int j = 1; j<=n; j++){

				System.out.print("*  ");
			}

			System.out.println();
		}

		System.out.println();
	}
}
