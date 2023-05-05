
// WAP to find the electricity bill of the house
//
// if units <= 100 then  1 rupee per unit
// if units > 100 then 2 rupees per unit
//

class Demo{

	public static void main(String[] args){
		

		int units = 200;

		if( units <= 100)
			System.out.println("bill is " + (units * 1));
		else{
		//	System.out.println("bill is " + ( 100* 1+ (units - 100)*2));
			System.out.println("bill is " + (units *2 -100));
		}

	}
}
