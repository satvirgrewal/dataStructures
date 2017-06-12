package geeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class SamAndSubStrings {
	static final int MOD = 1000000007;
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	int size = input.length();
	long[] sum = new long[size];
	sum[0] = input.charAt(0)-'0';
	for(int i=1;i<size;i++){
		sum[i]=(((i+1)*(input.charAt(i)-'0'))%MOD+ ((10 * (sum[i-1]))%MOD))%MOD;
		//sum[i] = sum[i]%MOD;
	}
	System.out.println(Arrays.toString(sum));
	long total=0;
	for(int i=0;i<size;i++){
		total=(total+sum[i])%MOD;
	}
	System.out.println(total);
}
}
