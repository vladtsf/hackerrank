package ArraysDataStructures;

import java.util.Arrays;
import java.util.Map;
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
                if(dy == 0 && dx != 0) continue;
                sum += input[y + dy][x + dx];
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        fillUp();

        
        int max = Integer.MIN_VALUE;
//
        for(int x = 1; x < side - 1; x++) {
            for(int y = 1; y < side - 1; y++) {
                int sum = calculateSum(x, y);

                if(sum > max) max = sum;
            }
        }

        System.out.println(max);

    }

}
