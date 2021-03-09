import java.util.*;

public class LineComparisonComputation {

public static void main (String args []){
        System.out.print("Enter x y conrdinate of point 1 and 2 respectively for line 1 : \n");
        Scanner sc = new Scanner(System.in);
        //Inputs for line 1
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double firstLineLength = Math.pow(x2-x1,2) + Math.pow(y2-y1,2);
	String length1 = Double.toString(firstLineLength);

        //Inputs for line 2
        System.out.print("Enter x y conrdinate of point 1 and 2 respectively for line 2 : \n");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        double secondLineLength = Math.pow(x4-x3,2) + Math.pow(y4-y3,2);
	String length2 = Double.toString(secondLineLength);

	if (length1.equals(length2))

              System.out.println("Lines are equal");
        else
           System.out.println("Lines are not equal");
        }
}




