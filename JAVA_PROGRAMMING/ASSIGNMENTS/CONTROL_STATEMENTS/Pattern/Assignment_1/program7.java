
// WAP to print following pattern
//
//	1    2    9
//	4    25   6
//	49   8    81


class pattern{

	public static void main(String[] args){
		int num = 1;

		for(int i = 1; i <= 3;i++){

			for(int j = 1; j <= 3; j++){
				if(num % 2== 1)
					System.out.print((num*num) +"\t");
				else
					System.out.print(num+ "\t");

				num++;
			}
		
		System.out.println();
		}
	}
}
