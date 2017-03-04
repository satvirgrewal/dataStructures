package geeksForGeeks;

public class LongestSubstringWithoutRepeatingCharacters {
	
	
	static int length(String input){
		int[] visited = new int[256];
		int m=0 ;
		while(m<256){
			visited[m]=-1;
			m++;
		}
		int l = input.length();
		int prevIndex =0;
		int currentLength = 1;
		int maxLength = 1;
		
		visited[input.charAt(0)] = 0;
		
		for(int i = 1; i<l;i++){
			if (visited[input.charAt(i)]==-1){
				currentLength++;
			visited[input.charAt(i)]=i;}
			else if(i-visited[input.charAt(i)]>currentLength){
				currentLength++;
				visited[input.charAt(i)]=i;
			}
			else if(visited[input.charAt(i)]-prevIndex>=currentLength){
				maxLength = Math.max(maxLength, currentLength);
				currentLength = i-prevIndex;
				visited[input.charAt(i)]=i;
			}
		}
		return Math.max(maxLength, currentLength);
	}
	
	
	public static void main(String[] args){
		String input = "ABDEFGABEF";
		System.out.println(length(input));
	}
}
