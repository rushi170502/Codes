
// guess the output:

class quiz{

	public static void main(String[] args){

		if(true)
			if(false)
				System.out.println("Inside if");
			else
				System.out.println("Inside else1");// o/p : if becomes false then goes to else
		else
			System.out.println("Inside else2");
	}
}
