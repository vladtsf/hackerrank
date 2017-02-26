package LinkedListDataStructures;

public class PrependToLinkedList {
    public static void main() {
        new PrintLinkedList().Print(
            new PrependToLinkedList().Insert(new Node(1, new Node(2, new Node(3))), 0)
        );
    }
    
    Node Insert(Node head, int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        return node;
    }
}
