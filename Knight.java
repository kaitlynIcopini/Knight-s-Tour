/**
 *
 * @author Kaitlyn Icopini
 */

public class Knight {
    private int position;	//Position of the knight
    //All the moves the knight can make
    private int[][] moves = {{+2,+1}, {+2,-1}, {-2,+1}, {-2,-1}, {+1,+2}, {+1,-2}, {-1,+2}, {-1,-2}};
    
    //Constructor
    public Knight(){
        position = 0;	//Starts the position out at 0, has not been places on board
    }
    
    //Returns the moves the knight can make
    public int[][] getMoves(){
    	return moves;
    }
    
    //Places the knight on the board at position p
    public void addPosition(int p){
    	position = p;
    }
    
    //Returns position
    public int getPosition(){
    	return position;
    }
}
