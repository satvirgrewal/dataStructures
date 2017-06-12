package geeksForGeeks;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int t1 = scan.nextInt();
	int t2= scan.nextInt();
	int n = scan.nextInt();
	
	BigInteger[] op = new BigInteger[n+1];
	op[1]=BigInteger.valueOf(t1);
	op[2]=BigInteger.valueOf(t2);
	for (int i=3;i<=n;i++){
		op[i] = op[i-2].add((op[i-1].multiply(op[i-1])));
	}
	System.out.println(op[n]);
}
}
