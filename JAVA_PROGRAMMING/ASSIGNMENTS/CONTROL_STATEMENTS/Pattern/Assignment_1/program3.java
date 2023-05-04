
// WAP to print following pattern
//
//	14   15   16   17
//	15   16   17   18
//	16   17   18   19
//	17   18   19   20


class pattern{

	public static void main(String[] args){
		int num = 4;

		for(int i = 1; i <= num;i++){


			for(int j = 1; j <= num; j++){

				//System.out.print(num+"   ");
				 System.out.print(" \t"+(num*3 + i + j));
			}
		System.out.println();
		}
	}
}
