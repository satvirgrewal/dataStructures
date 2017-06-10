package geeksForGeeks;

import java.util.Scanner;
import java.util.Stack;

public class StringFromPattern {

	public static void main(String[] args) {
		
		String str="3[b2[ca]b]";
		getencode(str);
		
		
		}

		private static void getencode(String str){
			Stack <Integer>num=new Stack<Integer>();
			Stack <String>strs=new Stack<String>();
			StringBuilder finalstr=new StringBuilder();
			StringBuilder done=new StringBuilder();
			
			for(int i=0;i<str.length();i++){
				
				if(str.charAt(i)==']'){
					StringBuilder str2=new StringBuilder();
					while(!strs.peek().equals("[")){
						str2.append(strs.pop());
					}
					if(!strs.isEmpty())strs.pop();
					str2.reverse();
					if(!strs.isEmpty())
					finalstr.append(str2);
					int num1=num.pop();
					if(strs.isEmpty()){
						finalstr.insert(0,str2);
						for(int k=0;k<num1;k++)
							done.append(finalstr);
					}else
					for(int k=0;k<num1-1;k++){
						finalstr.append(str2);
					}
				}else
					if(Character.isDigit(str.charAt(i)))num.push(Integer.valueOf(str.charAt(i)+""));
					else strs.push(str.charAt(i)+"");
			}
		System.out.println(done);
		}
	}
