
// Unary operator..
//  ++, -- , 
//
//  2. post-increment
//     post- decrement
// 
//

class Operators{

	public static void main(String[] args){

		int x = 10;
		int y = 20;

		System.out.println(x++);//10
		System.out.println(y++);//20
		System.out.println(x);// 11
		System.out.println(y);// 21
		
		int ans1 = y++ + ++y + y++;// 20 + 22 + 22 = 64
		System.out.println("ans = " + ans1);

		// decrement
		int a= 10;
		int b=20;
		System.out.println(a--);// 10
		System.out.println(b--);// 20
		System.out.println(a);// 9
		System.out.println(b);// 19

		int ans2 = a-- + b++ + --b + a++;// 9 + 19 + 19 + 8 = 55

		System.out.println("ans2 = " + ans2);

	}
}
