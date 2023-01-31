/** Program file: Binmatrix
 *  @author Andrew Brockley
 *  @version Spring 2023
 *  Purpose: This function will run a depth search through the matrix recusrively. The method will change 
 *  zeros not surrounded by ones into ones. 
 */

public class Binmatrix {
    int[][] myMatrix =
    	{
        	{ 1, 1, 1, 1, 0, 0, 1, 1, 1, 1 },
        	{ 1, 0, 0, 1, 1, 0, 0, 1, 0, 1 },
        	{ 1, 0, 0, 1, 1, 1, 1, 1, 1, 1 },
        	{ 1, 1, 1, 1, 0, 0, 1, 1, 0, 1 },
        	{ 1, 1, 1, 1, 0, 0, 0, 1, 0, 1 },
        	{ 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
        	{ 1, 0, 0, 1, 1, 1, 1, 1, 1, 1 },
        	{ 1, 0, 0, 1, 1, 0, 0, 1, 0, 1 },
        	{ 1, 1, 1, 0, 1, 0, 1, 0, 0, 1 },
        	{ 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 }
    	};
		int row = 0;
		int col = 0;

    public void recursiveSearch(int col, int row){
        if(myMatrix[row][col]==0){
			if(myMatrix[row][col]==0||myMatrix[row][col]==0||myMatrix[row][col]==0||myMatrix[row][col]==0||myMatrix[row][col]==0||myMatrix[row][col]==0||myMatrix[row][col]==0||myMatrix[row][col]==0){

			}
		}
    }

    public static void main(String args[]){

    }
}
