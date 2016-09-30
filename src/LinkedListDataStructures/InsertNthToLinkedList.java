/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListDataStructures;

/**
 *
 * @author vtsvang
 */
public class InsertNthToLinkedList {
    public static void main() {
        new PrintLinkedList().Print(
            new InsertNthToLinkedList().InsertNth(null, 25, 0)
        );
    }
    
    Node InsertNth(Node head, int data, int position) {
        Node node = new Node();
        node.data = data;

        Node prev = null;
        Node next = head;
        
        for(int i = 0; i < position && next != null; i++) {
            prev = next;
            next = prev.next;
        }
        
        node.next = next;
        
        if(prev == null) {
            head = node;
        } else {
            prev.next = node;
        }
        
        return head;
    }

}
