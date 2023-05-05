// 
// WAP to print the numbers in given condition..

class Demo{

	public static void main(String[] args){

		int num= 50;
		int i =1 ;

		while(i<= num){

			if(i % 5 == 0){

				if(i > 40){

					break;
				}

				System.out.println(i);
			}
			i++;

		}
	}
}
