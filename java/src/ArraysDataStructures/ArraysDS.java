/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysDataStructures;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author vladt
 */
public class ArraysDS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "";
        
        for(int i = scan.nextInt(); i > 0; i--) {
            result = scan.nextInt() + " " + result;
        }
        
        System.out.println(result);
    }
}
