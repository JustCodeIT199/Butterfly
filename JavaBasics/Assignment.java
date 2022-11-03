//Calculate the bill of user including 18% gst 
import java.util.*;

public class Assignment {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("Your bill is: " + total);
        // Adding 18% gst to bill 
        float newTotal = (float) ((total) + (0.18*total));
        System.out.println("Your bill with 18% GST is : " + newTotal);

    }

    
}
