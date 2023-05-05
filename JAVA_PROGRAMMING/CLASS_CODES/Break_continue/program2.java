
// WAP to print the number if the number is divide by 3 && divide by 5 at once then break the loop;
//

class Demo{

	public static void main(String[] args){

		int num = 45;

		for(int i = 1; i<= num; i++){

			if(i % 3 == 0 && i % 5 == 0)
				break;

		System.out.println(i);
		}
	}
}
