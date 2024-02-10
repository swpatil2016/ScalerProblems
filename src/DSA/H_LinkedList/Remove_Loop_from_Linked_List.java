package DSA.H_LinkedList;

public class Remove_Loop_from_Linked_List {
    public static void main(String[] args) {
        // Create loop LinkedList;
        ListNode head = null; // For track of head node
        ListNode guide = null; // For connecting all node
        ListNode junction = null;
        for(int i = 1; i <= 10; i++){
            ListNode temp = new ListNode(i);
            if(i == 1){
                head = temp;
                guide = temp;
            }
            if(i == 5){
                junction = temp;
            }
            guide.next = temp;
            guide = temp;
        }
        guide.next = junction; // connect last node with junction to create loop of LinkedList;
/*        // loop to print the loop of LinkedList
        while(head != null){
            System.out.println(head.val +"  ");
            head = head.next;
        }*/
         // Code to remove the cycle
        // slow and fast
        ListNode s = head;
        ListNode f = head;
        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
            if(s == f) break;
        }
        ListNode a = head;
        while(a.next != s.next){
            a = a.next;
            s = s.next;
        }
        s.next = null;
        // To print the list
        while(head != null){
            System.out.println(head.val +"  ");
            head = head.next;
        }
    }
}
