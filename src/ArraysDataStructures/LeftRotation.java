package ArraysDataStructures;

import java.util.Scanner;

public class LeftRotation {
    private static int length;
    private static int d;
    private static int[] array;
    
    private static void shift() {
        for(int i = 0; i < d; i++) {
            int t = array[0];
            for(int j = 0; j < length - 1; j++) array[j] = array[j + 1];
            array[length - 1] = t;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        length = scan.nextInt();
        d = scan.nextInt();
        array = new int[length];
        
        for(int i = 0; i < length; i++) {
           array[i] = scan.nextInt();
        }
        
        shift();
        
        for(int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        
        scan.close();
    }
}
