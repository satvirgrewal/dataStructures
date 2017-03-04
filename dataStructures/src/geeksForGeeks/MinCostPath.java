package geeksForGeeks;

public class MinCostPath {

	static int minCost(int[][] cost, int m, int n){
		if(m<0||n<0){
			return Integer.MAX_VALUE;
		}
		
		int[][] min = new int[m+1][n+1];
		min[0][0] = cost[0][0];
		for(int i = 1;i<=m;i++){
			min[i][0]= cost[i][0] + min[i-1][0];
		}
		for(int j =1;j<=n;j++){
			min[0][j] = cost[0][j] + min[0][j-1]; 
		}
		for(int i=1;i<=m;i++){
			for(int j =1;j<=n;j++){
				min[i][j]=cost[i][j] + min(min[i-1][j-1], min[i-1][j], min[i][j-1]);
			}
		}
		return min[m][n];
	}
	static int min(int x, int y, int z){
		if(x<y)
			return (x<z)?x:z;
		else
			return (y<z)?y:z;
	}
	
	public static void main(String args[])
    {
        int cost[][]= {{1, 2, 3},
                       {4, 8, 2},
                       {1, 5, 3}};
        System.out.println("minimum cost to reach (2,2) = " +
                                         minCost(cost,2,2));
    }
}
