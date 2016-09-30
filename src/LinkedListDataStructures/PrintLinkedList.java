package LinkedListDataStructures;

public class PrintLinkedList {
    
    public static void main(String[] args) {
        new PrintLinkedList().Print(new Node(1, new Node(2, new Node(3))));
    }
    
    void Print(Node head) {
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }
}
