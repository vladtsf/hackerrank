/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysDataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author vladt
 */
public class DynamicArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int Q = scan.nextInt();
        
        int lastAns = 0;
        
        HashMap<Integer, ArrayList<Integer>> seqList = new HashMap<>();
        
//        ArrayList<ArrayList<Integer>> seqList = new ArrayList<>(N);
//        int[][] seqList = new int[N][N];
//        int[] sizes = new int[N];

        for(int i = 0; i < Q; i++) {
            int operation = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int seqIdx = (x ^ lastAns) % N;
            

            if(operation == 1) {
                if(seqList.get(seqIdx) == null) {
                    seqList.put(seqIdx, new ArrayList<>());
                }
                seqList.get(seqIdx).add(y);
//                seqList[seqIdx][sizes[seqIdx]++] = y;
            } else {
                int size = seqList.get(seqIdx).size();
                lastAns = seqList.get(seqIdx).get(y % size);
                System.out.println(lastAns);
//                int size = sizes[seqIdx];
//                lastAns = seqList[seqIdx][y % size];
//                System.out.println(lastAns);
            }
        }
    }
}
