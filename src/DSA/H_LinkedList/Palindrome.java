package DSA.H_LinkedList;

public class Palindrome {
    public static void main(String[] args) {
        // Create LinkedList;
        ListNode head = null; // For track of head node
        ListNode guide = null; // For connecting all node

        for(int i = 1; i <= 20; i++){
            ListNode temp = new ListNode(i);
            if(i == 1){
                head = temp;
                guide = temp;
            }
            guide.next = temp;
            guide = temp;
        }
        for(int i = 22; i >= 1; i--){
            ListNode temp = new ListNode(i);
            guide.next = temp;
            guide = temp;
        }
        // slow and fast logic
        ListNode s = head;
        ListNode e = head;
        while(e.next != null && e.next.next != null){
            s = s.next;
            e = e.next.next;
        }
        // Create two new LinkedList
        e = s.next;
        s.next = null;
/*        // Print first list
        while(head != null){
            System.out.println(head.val +"  ");
            head = head.next;
        }
        // Print second list
        while(e != null){
            System.out.println(e.val +"  ");
            e = e.next;
        }
*/
        // Reverse the second LinkedList;
        ListNode B = null;
        ListNode f = e;
        while(f != null){
            f = f.next;
            e.next = B;
            B = e;
            e = f;
        }
        ListNode a = head;
        ListNode b = B;

        int key = 1;
        // Cheack if lists are palindrome or not
        while(a != null && b != null){
            if(a.val != b.val) {
                key = 0;
                System.out.println("LinkedList is not palindrome");
                break;
            }
            a = a.next;
            b = b.next;
        }
        if(key == 1){
            System.out.println(" is palindrome ");
        }
    }
}
