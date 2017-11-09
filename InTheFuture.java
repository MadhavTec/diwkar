import java.lang.Math;
import java.util.Scanner;
public class min {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input 3 integers: ");
        int A = Integer.parseInt(keyboard.nextLine());
        int K = Integer.parseInt(keyboard.nextLine());
        int P = Integer.parseInt(keyboard.nextLine());
        int min = Math.min(A,K);
        if(min>K){ //suppose x is max then compare x with z to find max number
            min = Math.min(A, K);    
        }
        else{ 
            min = Math.min(K,P);    
        }
        System.out.println("The min of three is: " + min);
    }
} 