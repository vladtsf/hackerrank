package LinkedListDataStructures;

public class DeleteNode {
    public static void main(String[] args) {
        new PrintLinkedList().Print(new DeleteNode().Delete(new Node(1, new Node(2, new Node(3))), 1));
    }
    
    Node Delete(Node head, int position) {
        if(head == null) return null;
        if(position == 0) return head.next;
                
        Node current = head;
        
        for(int i = 0; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }
        
        if(current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }
}
