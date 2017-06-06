//There is a stack of water glasses in a form of pascal triangle and a person wants to pour the water at the topmost glass, but the capacity of each glass is 1 unit . Overflow takes place in such a way that after 1 unit, 1/2 of remaining unit gets into bottom left glass and other half in bottom right glass.
//
//Now the pours K units of water in the topmost glass and wants to know how much water is there in the jth glass of the ith row.
//
//Assume that there are enough glasses in the triangle till no glass overflows. 
//
//Input:   First line of the input contains an integer T denoting the number of test cases and each test case consists of three lines. First line contain an integer K, second line contains an integer i and third line contains an integer j.
//
//
//Output: Corresponding to each test case output the remaining amount of water in jth cup of the ith row correct to 6 decimal places.
//
//
//Constraints:
//
//T<=20
//K<=1000
//i <= K
//j<= K
//                
//Example:
//Input:
//
//1
//3 
//2
//1
//
//Output:
//1

package geeksForGeeks;

import java.util.Arrays;

public class WaterOverflow {
public static void main(String[] args){
	
	int row = 1;
	int glass =1;
	float k = 5;
	
	int rowop=3;
	int glassop = 2;
	float[][] op = new float[rowop+1][rowop+1];
	trickle(k,row,glass,op);
	for (float[] x : op)
	{
	   for (float y : x)
	   {
	        System.out.print(y + " ");
	   }
	   System.out.println();
	}
	System.out.println(op[rowop][glassop]);
}

static void trickle(float k, int row, int glass,float[][] op){
	if(k<=1){
		op[row][glass]= op[row][glass]+k;
		return;
	}
	if(k>1){
		op[row][glass]=1;
		trickle((k-1)/2,row+1,glass,op);
		trickle((k-1)/2,row+1,glass+1,op);
		
	}
}


}