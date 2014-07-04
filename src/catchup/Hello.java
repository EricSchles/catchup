package catchup;

import java.lang.String;

class Stuff{
	
	public static int factorial(int num){
		if( num == 0){
			return num;
		}else if(num == 1){
			return num;
		}else{
			return num*factorial(num-1);
		}
	}
	
	public static double squareRoot(double num){
		return squareRoot(num,0.10,0.0);
	}
	
	static double squareRoot(double num, double episilon,double finalVal){
		finalVal += num/2;
		if( Math.abs(Math.pow(finalVal,2) - num) < episilon ){
			return finalVal;
		}else{
			finalVal -= num/2;
			return squareRoot(finalVal,episilon,finalVal);
		}
	}
}

public class Hello {

	public static void main(String[] args){
		
		System.out.println("Hello world");
		int x = 5;
		System.out.println(x);
		int fact = Stuff.factorial(x);
		System.out.println(fact);
		System.out.println(Stuff.squareRoot(9));
		
	}
}
