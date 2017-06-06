package geeksForGeeks;

//Given a number line from -infinity to +infinity. You start at 0 and can go either to the 
//left or to the right. The condition is that in i’th move, you take i steps.
//a) Find if you can reach a given number x
//b) Find the most optimal way to reach a given number x, 
//if we can indeed reach it. For example, 3 can be reached om 2 steps, (0, 1) (1, 3) and 4 
//can be reached in 3 steps (0, -1), (-1, 1) (1, 4)

public class MinimumStepsToReachADestination {
public static void main(String[] args){
	int destination = 11;
	int step = 0;
	int source =0 ;
	 System.out.println(steps(source, step, destination));
	
}
static int steps(int source, int step, int destination){
	System.out.println( "source" + (source) + "  Step " + step );
	if(source == destination) return step;
	if(Math.abs(source)>Math.abs(destination)) return Integer.MAX_VALUE;
	
	//System.out.println("Right print"+ "source" + (source+step) + "  Step " + step );
	int right = steps(source+step+1,step+1,destination);
	//System.out.println("left print"+ "source" + (source+step) + "  Step " + step );
	int left = steps(source-step-1,step+1, destination);
	
	return Math.min(right, left);
}
}
