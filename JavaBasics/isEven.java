import java.util.*;

public class isEven{
    public static void main(String args []){
        Scanner sc = new Scanner();
        int num = sc.nextInt();
        
    }
    public static boolean isEven(int number){
        if (number%2==0){
            return true;
            System.out.println("Num is even");

        }
        else{
            return false;
            System.out.println("Num is odd");

        }
    }
}
