
import java.util.Scanner;

/**
 *
 * @author Kaitlyn Icopini
 */
public class Input {
 
    public static void main(String[] args){
        int size;
        int start;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter board size: ");
        size = s.nextInt();
        System.out.println("Enter the beginning square (1 to " + (size*size) + "): ");
        start = s.nextInt();
        
        Board b = new Board(size, start);
        
    }
}