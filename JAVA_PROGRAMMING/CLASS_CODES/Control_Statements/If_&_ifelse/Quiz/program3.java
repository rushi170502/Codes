
// WAP to check the output of program

class quiz{

	public static void main(String[] args){

		if(10)// error : incompatible type
			System.out.println("Inside if1");

		else
			System.out.println("Inside else");

	}
}
// o/p :
//	error : incompatible types : int cannot be converted to boolean
