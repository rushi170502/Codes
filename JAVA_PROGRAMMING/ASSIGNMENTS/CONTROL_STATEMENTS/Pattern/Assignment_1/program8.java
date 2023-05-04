 // 
 // WAP to print following pattern
 
// 	A   b   C   d
// 	E   f   G   h
// 	I   j   K   l
// 	M   n   O   p


class pattern{

	public static void main(String[] args){

		char ch = 'A';
		char ch1 = 'a';
		for(int i = 1;i <= 4; i++){

			for(int j = 1; j <= 4; j++){

				System.out.print("\t");

				if(j % 2 == 1)
					System.out.print(ch + "  ");
				else
					System.out.print(ch1 +"  ");

				ch++;
				ch1++;

			}

			System.out.println();
		}
	}
}
