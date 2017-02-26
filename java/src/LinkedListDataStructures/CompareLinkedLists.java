package LinkedListDataStructures;

public class CompareLinkedLists {
    public static void main(String[] args) {
        System.out.println(new CompareLinkedLists().CompareLists(
            new Node(1, new Node(2, new Node(3))),
            new Node(1, new Node(2, new Node(3)))
        ));
    }
    
    int CompareLists(Node headA, Node headB) {
        while(headA != null && headB != null) {
            if(headA.data != headB.data) {
                return 0;
            }
            
            headA = headA.next;
            headB = headB.next;
        }
        
        if(headA != null || headB != null) {
            return 0;
        }
        
        return 1;
    }
}
