package LinkedListDataStructures;

class Node {
    Node() {
        this(0);
    }
    
    Node(int data) {
        this(data, null);
    }
    
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    
    int data;
    Node next;
}
