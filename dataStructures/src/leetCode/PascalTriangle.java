package leetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static void main(String[] args){
		List<List<Integer>> output = generate(3);
	}
    public static List<List<Integer>> generate(int numRows) {
       // List<Integer> rows = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        //List<Integer> row = new ArrayList<Integer>();
        int numRow =1;
        List<Integer> last ;
        if(numRows == 0){
            return result;
        }
        if(numRows>0){
             List<Integer> row = new ArrayList<Integer>();
             row.add(1);
             result.add(row);
             numRow = 2;
        }
        while (numRows>numRow){
           //row.clear();
            List<Integer> row = new ArrayList<Integer>();
        	last = result.get(numRow-2);
            row.add(0,1) ;
            row.add(numRow-1,1);
            for(int i = 1; i<numRow-1; i++){
                row.add(i,last.get(i-1)+last.get(i)) ;
         }
                result.add(row);
        }
        return result;
        }
    }
