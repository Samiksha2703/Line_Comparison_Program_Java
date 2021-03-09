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
	int length1 = (int) firstLineLength;
//
	//Inputs for line 2
        System.out.print("Enter x y conrdinate of point 1 and 2 respectively for line 2 : \n");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        double secondLineLength = Math.pow(x4-x3,2) + Math.pow(y4-y3,2);
	int length2 = (int) secondLineLength;

	//Comparing two line length
	int compareValue = Integer.compare(length1,length2);
	switch(compareValue){
        case 0 :
                System.out.println("Lines are equal");
                break;
        case 1 :
                System.out.println("Lines 1 is greater than line 2");
                break;
        default :
                System.out.println("Line 1 is less than line 2");
                break;
                }
	}
}




