
import java.util.Scanner;

/**
 *
 * @author Kaitlyn Icopini
 */

public class Input {
 
    public static void main(String[] args){
        int size = 1;						//Size of the board
        int start = 1;						//Starting position
        Scanner s = new Scanner(System.in);	//Scanner to get input
        
        while(size != 0){
        	//Gets input from user
	        System.out.print("Enter board size (5 for 5x5), enter 0 to exit: ");
	        size = s.nextInt();
	        if (size != 0){
	        	System.out.print("Enter the beginning square (1 to " + (size*size) + "): ");
	        	start = s.nextInt();
	        
	        	//Creates new board
	        	Board b = new Board(size);
	        	b.findPath(start);
	        } 
        }
        System.out.println("Good bye");
    }
}