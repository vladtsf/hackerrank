/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysDataStructures;

import java.util.Scanner;

/**
 *
 * @author vladt
 */
public class TwoDArray {
    private final static int size = 36;
    private final  static int side = (int) Math.sqrt(size);
    private static int[][] input;
    
    private static void fillUp() {
        Scanner scan = new Scanner(System.in);
        input = new int[side][side];
        
        for(int i = 0; i < size; i++) {
            input[i / side][i % side] = scan.nextInt();
        }
    }
    
    private static int calculateSum(int x, int y) {
        int sum = 0;
                
        for(int dx = -1; dx <= 1; dx++) {
            for(int dy = -1; dy <= 1; dy++) {
                if(dy == 0 && dx != 1) continue;
                sum += input[y + dy][x + dx];
            }
        }
        
        return sum;
    }
    
    
    public static void main(String[] args) {
        fillUp();
        
        int[] result = new int[(side - 2) * (side - 2)];
        int sumId = 0;
        
        for(int x = 1; x < side - 1; x++) {
            for(int y = 1; y < side - 1; y++) {
                result[sumId++] = calculateSum(x, y);
            }
        }
    
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < result.length; i++)
            if(result[i] > max) max = result[i];
        
        System.out.println(max);
    }
        
}
