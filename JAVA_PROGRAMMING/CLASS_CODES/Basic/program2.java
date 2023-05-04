// WAP to implement the class with variables...
//
// instance variables and local variables..
//
class Demo{

	int var1=10;// Global or instance variable which is store in heap section...
		    // Error is given: non-static variables can not refrenced from static context area..
		    // if we want it , then we need to define that to static or call by object..


	public static void main(String args[]){

		int var2 = 30; //local variables which are stored at java stack

		System.out.println(var1);
		System.out.println(var2);
	}
}
