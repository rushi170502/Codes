
// Unary operator..
//  ++, -- , 
//
//  1. pre-increment
// 
//

class Operators{

	public static void main(String[] args){

		int x = 10;
		int y = 20;

		System.out.println(++x);//11
		System.out.println(++x);//12
		System.out.println(x);// 12
		
		int ans1 = y++ + ++y + y++;// 20 + 22 + 22 = 64
		System.out.println("ans = " + ans1);

	}
}
