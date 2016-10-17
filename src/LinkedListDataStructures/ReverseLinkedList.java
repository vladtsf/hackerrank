package LinkedListDataStructures;

public class ReverseLinkedList {
    public static void main(String[] args) {
        new PrintLinkedList().Print(
            new ReverseLinkedList().Reverse(new Node(1, new Node(2, new Node(3, new Node(4)))))
        );
    }
    
    Node Reverse(Node head) {
        if(head == null) return null;
        
        Node next = head.next, prev = head, tmp;
                
        while(next != null) {
            tmp = next.next;
            
            // switch           
            next.next = prev;
            
            if(prev == head) {
                // avoiding loops                
                head.next = null;
            }
            
            prev = next;
            next = tmp;
        }
        
        return prev;
    }
}
