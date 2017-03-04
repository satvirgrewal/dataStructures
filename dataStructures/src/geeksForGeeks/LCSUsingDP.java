package geeksForGeeks;

public class LCSUsingDP {
	
	public static void main(String[] args){
		String one="AGGTAB";
		String two = "GXTXAYB";
		System.out.println("Size of LCS " + lcs(one,two));
	}
	static int lcs(String one, String two){
		int result =0;
	char[] un = one.toCharArray();
	char[] deux = two.toCharArray();
	int[][] matrix = new int[un.length+1][deux.length+1];
	for(int i=0;i<=deux.length;i++){
		matrix[0][i]=0;
	}
	
	// if B is null then LCS of A, B =0
	for(int i=0;i<=un.length;i++){ 
		matrix[i][0]=0;
	}
	for(int i = 1; i<=un.length; i++){
		for(int j=1 ; j<=deux.length; j++){
			if(un[i-1]==deux[j-1])
				matrix[i][j]=1+matrix[i-1][j-1];
			else{
				matrix[i][j]= Math.max(matrix[i-1][j], matrix[i][j-1]);
			}
		}
		}
	
	for(int i=0;i<=un.length;i++){
		for(int j=0; j<=deux.length;j++){
			result=Math.max(result, matrix[i][j]);
		}
	}
	
	return result;
}
}
