import java.util.Stack;

/**
 *
 * @author Kaitlyn Icopini
 */

public class Board {
    private int[][] board;	//Represents the chess board
    private Stack stack;	//Stack to hold all the knights on the board
    private String path;	//The path the knights take around the board
    private int max;		//Maximum number of squares on the board
    private int stackNum;	//Tracks the number for knights in the stack
    private int numMoves;	//Tracks the number of moves made
    
    //Constructor
    public Board(int x){
        board = new int[x][x];	//Initiates the board to the size of user input
        stack = new Stack();	//Initiates the stack
        max = x*x;				//Finds the max
        stackNum = 0;			//Starts number in the stack at 0
    }
    
    //Finds the path that the knights take around the board
    public void findPath(int start){
    	Knight k = new Knight();
    	k.addPosition(start);
    	stack.push(k);
    	if(nextPosition(start)){
    		System.out.println("SUCCESS:");
    	}else{
    		System.out.println("FAILURE:");
    	}
    	System.out.println("Total Number of Moves = " + numMoves);
    	System.out.println("Moving Sequence: " + path);
    }
    
    //Finds the position for the next knight
    private boolean nextPosition(int p){
    	boolean m = false;
    	
    	if(stackNum == max){
    		m = true;
    	}
    	else{
    		Knight knight = new Knight();
    		int[][] moves = knight.getMoves();
    		int[] moveTracker = new int[8];
    		
    		
    	}
    	return m;
    }
}
