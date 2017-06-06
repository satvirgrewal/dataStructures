//Given an integer n. Print first n elements of Recaman’s sequence.
//It is basically a function with domain and co-domain as natural numbers and 0. It is recursively defined as below:
//Specifically, let a(n) denote the (n+1)-th term. (0 being already there).
//The rule says:
//
//a(0) = 0,
//if n > 0 and the number is not 
//   already included in the sequence,
//     a(n) = a(n - 1) - n 
//else 
//     a(n) = a(n-1) + n 
package geeksForGeeks;

import java.util.HashMap;

public class RecamanSequence {
public static void main(String[] args){
	int n = 17;
	HashMap<Integer,Integer> op = new HashMap<Integer,Integer>(n);
	op.put(0, 0);
	populate(op,n);
	System.out.println(op.values());
}

static void populate(HashMap<Integer,Integer> op, int n){

	for(int i=1;i<n;i++){
		int temp = op.get(i-1)-i;
		if(temp>0 && !op.containsValue(temp)){
			op.put(i,temp);
		}
		else{
			op.put(i, op.get(i-1)+i);
		}
	}
	
}

}
