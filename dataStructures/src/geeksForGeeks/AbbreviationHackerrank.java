package geeksForGeeks;

import java.util.Scanner;

public class AbbreviationHackerrank {
	static int l1=0;
	static int l2=0;

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		String a = scanner.next();
		String b = scanner.next();
		l1 = a.length();
		l2 = b.length();
		int i=0;
		int j=0;
		if(characterPossible(a,b,i,j)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

	static boolean characterPossible(String a, String b, int i, int j){
		if(j==l2){
			return checkRemaining(a,i);
		}
		if(i==l1){
			return false;
		}
		boolean answer = false;
		if(Character.isUpperCase(a.charAt(i))){
			if(a.charAt(i)==b.charAt(j)){
				answer = characterPossible(a, b, i+1, j+1);
			}
			else{
				answer = false;
			}
		}
		else{
			if(Character.toUpperCase(a.charAt(i))== b.charAt(j)){
				answer =  characterPossible(a, b,i+1,j+1) || characterPossible(a, b, i+1, j);
			}
			else{
				answer = characterPossible(a, b, i+1, j);
			}
		}
		return answer;
	}

	static boolean checkRemaining(String s, int a){
		for(int i=a; i<s.length(); i++){
			if(Character.isUpperCase(s.charAt(i))){
				return false;
			}
		}
		return true;
	}
}
