package ArraysDataStructures;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class SparseArrays {
    private static int N, Q;
    private static Hashtable<String, Integer> strings;
    private static int[] queries;
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        N = scan.nextInt();
        strings = new Hashtable<>();
        
        for(int i = 0; i < N; i++) {
            String next = scan.next();
            int counter = strings.getOrDefault(next, 0);
            strings.put(next, counter + 1);
        }
        
        
        Q = scan.nextInt();
        queries = new int[Q];
        
        for(int i = 0; i < Q; i++) {
            queries[i] = strings.getOrDefault(scan.next(), 0);
        }
        
        scan.close();
        
        for(int counter : queries) {
            System.out.println(counter);
        }
    }
}
