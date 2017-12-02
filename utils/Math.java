package utils;

public class Math{


	public static int factorial(int num){
		if (num <= 0) {
			return 1;
		}

		return num * factorial(num-1);
	}


	public static int factorialLoop(int num){
		int fact = 1;
		
		for (int i = 1; i <= num; i++) {
			
			fact = fact * i;
		}
		return fact;
	}
}