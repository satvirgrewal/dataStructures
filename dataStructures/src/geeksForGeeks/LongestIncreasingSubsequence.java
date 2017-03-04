package geeksForGeeks;

class LongestIncreasingSubsequence
{
static int max_lis_length; // stores the final LIS
 

static private int lis(int[] arr, int n){
	int[] LIS = new int[n];
	int max =0;
	for(int i=0;i<n;i++){
		LIS[i]=1;
	}
	
	for(int i=1;i<n;i++){
		for(int j=0;j<i;j++){
			if(arr[i]>arr[j] && LIS[i]<LIS[j]+1){
				LIS[i]=LIS[j]+1;
			}
		}
	}
	for(int i:LIS){
		if(max<i){
			max=i;
		}
	}
	
	
return max;	
}

 
// Driver program to test the functions above
public static void main(String args[])
{
    int arr[] = {1,2,3,4,5};
    int n = arr.length;
    System.out.println("Length of LIS is " + lis( arr, n ));
}
 
} // End of LIS class.