package LinkedListDataStructures;

public class ReversePrintLinkedList {
    
    public static void main(String[] args) {
        new ReversePrintLinkedList().ReversePrint(new Node(1, new Node(2, new Node(3))));
    }
    
    void ReversePrint(Node head) {
        if(head == null) return;
        if(head.next != null) ReversePrint(head.next);
        System.out.println(head.data);
    }
}
