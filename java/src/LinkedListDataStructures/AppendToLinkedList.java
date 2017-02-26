package LinkedListDataStructures;

public class AppendToLinkedList {
    public static void main() {
        new PrintLinkedList().Print(
            new AppendToLinkedList().Insert(new Node(1, new Node(2, new Node(3))), 4)
        );
    }
    
    Node Insert(Node head, int data) {
        Node node = new Node();
        node.data = data;
        
        if(head == null) return node;
        
        Node current = head;
        
        while(current.next != null) {
            current = current.next;
        }
        
        current.next = node;
        
        return head;
    }
}
