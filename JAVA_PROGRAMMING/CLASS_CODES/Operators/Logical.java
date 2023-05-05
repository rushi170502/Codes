
// Logical operators in java ( &&  and || )
// logical opeartors has only boolean value near them...
//
class Operators{

	public static void main( String[] args){

		int x = 10;
		int y = 20;

		// ans = x && y; // it gives error of bad operands..
		// && operation
		boolean ans1 = x > y && x < y;// we need boolean because it returns boolean value
		System.out.println(ans1);

		boolean ans2= x < y && y > x ;// if both condition are true then it gives true otherwise it return
					      // false 
		System.out.println(ans2);

		// || operation
		boolean ans3 = x < y || y < x;// if anyone of these condition becomes true it return
					      // true
		System.out.println(ans3);


	}
}

