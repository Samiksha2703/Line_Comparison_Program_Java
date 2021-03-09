
import java.util.*;

public class LineComparisonComputation {

public static void main (String args []){
	System.out.print("Enter x y conrdinate of point 1 and 2 respectively : \n");
	Scanner sc = new Scanner(System.in);
	int x1 = sc.nextInt();
	int y1 = sc.nextInt();
 	int x2 = sc.nextInt();
   	int y2 = sc.nextInt();
	double lineLength = Math.pow(x2-x1,2) + Math.pow(y2-y1,2);
	System.out.println("Length of line = " +lineLength +" units");
	}
}
