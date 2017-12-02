package utils;

public class Math{


	public static long factorial(int num){
		if (num <= 0) {
			return 1;
		}

		return num * factorial(num-1);
	}


	public static long factorialLoop(int num){
		long fact = 1;
		
		for (int i = 1; i <= num; i++) {
			
			fact = fact * i;
		}
		return fact;
	}
}
