
// program 7

class Demo{

	public static void main(String[] args){

		int var = 10;
		
		while(var > 5){
			System.out.println("var ="+var);
			break;
			var--;// error : unreachable statement
		}
	}
}
