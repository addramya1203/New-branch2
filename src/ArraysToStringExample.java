import java.util.Arrays;

public class ArraysToStringExample {

	public static void main(String[] args) {

		// initialize a new String array
		String[] names = new String[]{
			"Alfred","Beth","Stan"	
		};
		
		// get the String representation of String array
		System.out.println("******Multi dimensional array******");
		System.out.println(Arrays.toString(names));				
		
		// get String representation multi dimensional array		
		int[][] value = new int[2][2];		
		value[0][0] = 1;
		value[0][1] = 2;
		value[1][0] = 3;
		value[1][1] = 4;			
		
		System.out.println("******Multi dimensional array******");
		System.out.println(Arrays.toString(value));
		
		
	}
}