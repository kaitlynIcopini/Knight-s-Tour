import java.util.LinkedList;

/**
 *
 * @author Kaitlyn Icopini
 */

public class Board {
    private LinkedList<Integer> sequence;	//LinkedList that holds the spaces the knights have visited
    private int max;						//Maximum number of squares on the board
    private int numMoves;					//Tracks number of moves made
    private int num;						//Size of the board
    //Moves a knight can make
    private int[][] knightMoves = {{1,-2}, {2,-1}, {2,1}, {1,2}, {-1,2}, {-2,1}, {-2,-1}, {-1,-2}};
    
    //Constructor
    public Board(int x){
        sequence = new LinkedList<Integer>();	//Initiates the LinkedList
        max = x*x;								//Finds the max number of positions on board
        num = x;   								//Finds the size of the board
    }
    
    //Finds the path that the knights take around the board
    public void findPath(int start){
    	boolean success = nextPosition(start);
    	
    	//If there success it true
    	if (success){
    		System.out.println("SUCCESS");
    		
    	}
    	//Success is false
    	else{
    		System.out.println("FAILURE");
    	}
    	
    	//Prints out numMoves
    	System.out.println("Total Number of Moves: " + numMoves);
    	System.out.println("Moving sequence: ");
    	
    	//Prints out the moving sequence, removes first position and prints it
    	//Keeps going until only one element is left
    	while (sequence.size() > 1){
    		System.out.print(sequence.remove() + " ");
    	}
    	
    	//Prints out the last position in parenthesis
    	System.out.print("(" + sequence.remove() + ")\n");
    }
    
    //Finds the position for the next knight
    private boolean nextPosition(int p){
    	boolean success = true;
    	sequence.add(p);
    	
    	//Checks to see if all positions have been visited
    	if (sequence.size() != max){
    		success = false;
    		numMoves++;							//Adds a move to numMoves
    		for (int i = 0; i < 8; i++){
	   			int x = (p-1) % num;			//Finds x position of p
	       		int y = (p-1) / num;			//Finds y position of p
	    			
	   			int dx = knightMoves[i][0];		//Finds how far knight moves in x direction
	   			int dy = knightMoves[i][1];		//Finds how far knight moves in y direction
	    			
	   			x = x + dx;						//Finds new x position
	   			y = y + dy;						//Finds new y position
	    		
	    		//Check to see if (x,y) is on the board
	    		if ((x >= 0 && x < num) && (y >= 0 && y < num)){
	   				int nextPos = x + y*num + 1;	//Finds single position number
	   				
	   				//Checks to see if spot is free, if free, returns nextPos
	   				if (!checkBoard(nextPos)){
	   					success = nextPosition(nextPos);
	   					//If success is true, then all positions have been visited
	   					if (success){
	   						return success;
	   					}
	    			}
	    		}	
	   		}
    		//No next position was found, last position is removed
    		if (sequence.size() > 1)
    			sequence.removeLast();	
    	}
   		return success;
    }
    
    //Checks to see if the position has already been visited
    private boolean checkBoard(int x){
    	return sequence.contains(x);	
    }
}
