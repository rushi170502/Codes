
// WAP to if the  i is divide by 3 and 5 or divide by 4 is yes then skip
// using continue statement

class Demo{

	public static void main(String[] args){

		int num = 50;

		for(int i = 1; i <= num; i++){

			if(((i % 3 == 0) && (i % 5 == 0) ) || (i % 4 == 0))
				continue;

			System.out.println(i);
		}
	}
}
