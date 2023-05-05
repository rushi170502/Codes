
// WAP print factors of a given number
class Demo{

	public static void main(String[] args){
	
		int num = 20;

		int i =1;
		for(; i <= num ; i++){

			if(num % i == 0)
				System.out.println(i);
		}

	}
		
}
