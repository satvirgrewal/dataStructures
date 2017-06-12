package geeksForGeeks;

import java.util.HashSet;
import java.util.Scanner;

public class XORPrime {
	static HashSet track = new HashSet<Integer>();
	
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int tests = scan.nextInt();
		while(tests-->0){
		int count = scan.nextInt();
		int[] input = new int[count];
		for(int i=0;i<count;i++){
			input[i]=scan.nextInt();
		}
		System.out.println(primeCount(0, 1, input)%(Math.pow(10, 9)+7));
		}
		
	}
	
	static int primeCount(int XOR, int i, int[] a){
		if(!track.contains(XOR) && i==a.length && primeNumber(XOR)){
				return 1;
		}
		int count = 0;
		track.add(XOR);
		if(i<a.length){
		 count =  (primeCount(XOR^a[i], i+1, a)+primeCount(XOR, i+1, a));
		}
		return count;
	}
	
	static boolean primeNumber(int a){
		boolean result= true;
		if(a==0||a%2==0){
			return result;
		}
		for(int i =3;i*i<=a;i+=2){
			if(a%i==0){
				result = false;
				break;
			}
		}
		return result;
	}
}
