package geeksForGeeks;

public class EditDistance {

	 static int editDistDP(String a, String b, int l1, int l2){
		 int[][] dp = new int[l1+1][l2+1];
		 
		 for(int i=0;i<=l1;i++){
			 for(int j=0;j<=l2;j++){
				 if(i==0){
					 dp[i][j]=j;
				 }
				 else if(j==0){
					 dp[i][j]=i;
				 }
				 else if(a.charAt(i-1)==b.charAt(j-1)){
					 dp[i][j]=dp[i-1][j-1];
				 }
				 else{
					 dp[i][j]=1+ min(dp[i][j-1],dp[i-1][j],dp[i-1][j-1]);
				 }
			 }
		 }
		return  dp[l1][l2];
	}
	 static int min(int a, int b, int c){
		 int x = Math.min(a, b);
		 return Math.min(x, c);
	 }
	public static void main(String args[])
    {
        String str1 = "sunday";
        String str2 = "saturday";
        System.out.println( editDistDP( str1 , str2 , str1.length(), str2.length()) );
    }
}
