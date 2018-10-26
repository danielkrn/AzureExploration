public class SearchSample {
	public static void main(String[] args) {
		int[][] list = {{1,13,5},{1,2,5},{0,7,113}}; 	//Defines an array of 3 arrays. Length = 3
		int searchValue = 113; 						//The value we are searching for
		int positionX = -1;							//default
		int positionY = -1;							//default

		PARENT_LOOP: for(int i=0; i<list.length; i++) { //Iterate through arrays. i = number of the array here.
			for(int j=0; j<list[i].length; j++) { //Seems to iterate through contents of current array (since [i] points at current array). j points at position of a member of the array?
				if(list[i][j]==searchValue) { 	  //Check whether this is what we are searching for. 	
					positionX = i + 1;					// Allocate position to parameters that will be printed. Doing + 1 thing cause Java fucking starts counting with 0, much confuse on output.
					positionY = j + 1;
				break PARENT_LOOP;					//This loop breaks the operation of the main for loop if value is found.
				} }
			}

		if(positionX==-1 || positionY==-1) {		//Checks: if either of array value or place value remained to == -1, then something fucking went wrong and value wasnt found.
			System.out.println("Value "+searchValue+" not found"); 
			} 
		else {	
			System.out.println("Value "+searchValue+" found at: " + "(Array "+positionX+", place "+positionY+")");
		} }
		}