package geeksForGeeks;

public class MinJumpsToReachEnd {

	
	public static void main(String[] args){
		int[] input = {1, 3, 6, 1, 0, 9};
		System.out.println(minSteps(input));
	}
	
	static int minSteps(int[] input){
		int[] steps= new int[input.length];
		if(input[0]==0){
			return Integer.MAX_VALUE;
		}
		steps[0]=0;
		for(int i=1;i<input.length;i++){
			steps[i]=Integer.MAX_VALUE;
			for(int j=0;j<i;j++){
				if(i<=j+input[j]&& steps[j]!=Integer.MAX_VALUE){
					steps[i]=Math.min(steps[i],steps[j]+1);
					break;
				}
				
			}
		}
		return steps[input.length-1];
		
	}
}
