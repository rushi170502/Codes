
/*
	WAP to print following pattern

	4    4    4    4 
	5    5    5    5
	6    6    6    6
	7    7    7    7
*/

class pattern{

	public static void main(String[] args){
		int num = 4;
		for(int i = 1; i <= num;i++){

			for(int j = 1; j <= num; j++){

				//System.out.print(num+"   ");
				//another logic  =num + i +1
				System.out.print(" \t "+(num + i -1));
			}

		System.out.println();
		}
	}
}
