//A function f is defined as follows F(n)= (1) +(2*3) + (4*5*6) ... n. Given an integer n the task is to print the F(n)th term.
//
//Input:
//The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test contains an integer n.
//
//Output:
//For each test case print the nth term of the sequence. .
//
//Constraints:
//1<=T<=100
//1<=N<=10
//
//Example:
//Input:
//2
//5
//7
//
//Output:
//365527
//6006997207

package geeksForGeeks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RecursiveSequence {
	
	static int product=0;
	
	public static void main (String[] args) {
		int count = 5;
		 int[] holder = new int[count+1];
		int[] array = {1,2,3,4,5} ;
		int[] op = new int[count];
		for(int i=0; i<count;i++){
			op[i]=calculateAndUpdateHolder(array[i],holder);
		}
		System.out.println(Arrays.toString(op));
	}
	
	private static int calculateAndUpdateHolder(int n, int[] holder){
		if(n<=0){
			return 0;
		}
		if(holder[n]!=0){
			return holder[n];
		}
		else{
		holder[n]= calculateAndUpdateHolder(n-1,holder)+ multiply(n,((n*(n-1))/2)+1) ;
		}
		return holder[n];
		
	}
	
	static int multiply(int count, int start){
		if(product!=1){
			product=1;
		};
		if(count==0)
			return 1;		
		 product = start * multiply(count-1, start+1);
		return product;
	}
	
	}
	
	

