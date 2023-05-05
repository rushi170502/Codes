
// WAP print factors of a given number and count
class Demo{

	public static void main(String[] args){
	
		int num = 20;
		int count =0;
		
		for(int i =1; i <= num ; i++){

			if(num % i == 0){
				count++;
				System.out.println(i);
			}

		}
		System.out.println("Count of factors is  : "+count);

	}
		
}
