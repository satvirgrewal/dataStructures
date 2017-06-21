package geeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubArrayAndSubSequence {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int[] input = new int[n];
			while(n>0){
				input[n-1]=scan.nextInt();
				n--;
			}
System.out.println(Arrays.toString(input));
System.out.println(subArray(input));


		}
	}
	
	static int subArray(int[] input){
		int maxSoFar = input[0];
		int currMax = input[0];
		 
		   for (int i = 1; i < input.length; i++) {
		        currMax = Math.max(input[i], currMax + input[i]);
		        maxSoFar = Math.max(maxSoFar, currMax);
		   }
		   return maxSoFar;
	}
}
