
// WAP to find the temperature is normal or high or low.
//
// if temp > 98.6 == high
// if temp < 98.6 == low
// else  	  == normal
//

class Demo{

	public static void main(String[] args){

		float temp = 93.6f;// f is mandatory otherwise it considered as double

		if(temp > 98.6f)
			System.out.println("temperature is high");
		else if( temp < 98.6f)
			System.out.println("Temperature is low");
		else
			System.out.println("temperature is normal");
	}
}
