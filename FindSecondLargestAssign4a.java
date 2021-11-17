package week3.Day2;

import java.util.Arrays;

public class FindSecondLargestAssign4a {

	public static void main(String[] args) {
		int[] seclargest = {3,2,11,4,6,7};
	    Arrays.sort(seclargest);
	    System.out.println("Second largest No is: " + seclargest[seclargest.length-2]);

	}

}
