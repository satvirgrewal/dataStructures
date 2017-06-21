package geeksForGeeks;

public class LongestCommonSubsequence {
static public void main(String[] args){
	String a = "abcdaf";
	String b = "acbcf";
	int result = lcs(a,b);
	System.out.println(result);
	
}
static int lcs(String a, String b){
	int[][] temp = new int[a.length()+1][b.length()+1];
	int max =0;
	//StringBuffer string = new StringBuffer();
	for(int i =1;i<=a.length();i++){
		for(int j=1;j<=b.length();j++){
			if(a.charAt(i-1)==b.charAt(j-1)){
				temp[i][j]=1+temp[i-1][j-1];
				//string.append(a.charAt(i-1));
				
			}
			else{
				temp[i][j] = Math.max(temp[i-1][j], temp[i][j-1]);
			}
			if(temp[i][j]>max){
				max= temp[i][j];
		}
		}
	}
	System.out.println(findTheString(temp,a,b));
	return max;
}

static String findTheString(int[][] temp, String a, String b){
	int i = temp.length-1;
	int j = temp[0].length-1;
	StringBuffer string = new StringBuffer();
	while(i>0&&j>0){
		if(temp[i][j]!=temp[i-1][j]&&temp[i][j]!=temp[i][j-1]){
			string.append(a.charAt(i-1));
			i=i-1;
			j=j-1;
		}
		else if(temp[i][j]==temp[i-1][j]){
			i=i-1;
		}
		else{
			j=j-1;
		}
	}
	
	return string.toString();
}
}
