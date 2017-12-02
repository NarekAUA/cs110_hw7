package utils;

public class ArrayUtils{
	public static void reverse(int[] arr){
		
		for (int i=0; i < (arr.length-1) / 2 ; i++) {
			int help = arr[i];
			arr[i] = arr[arr.length - (i+1)];
			arr[arr.length - (i+1)] = help;
		}
	}

public static String stringifyArray(int[] arr){
		String result = "";
		for(int i = 0; i < arr.length - 1; i++) {
			if (i == arr.length - 1) {
				result = result + arr[i];
			}
			result = result + arr[i] + "," ;
		}
		return result;
	}
}
