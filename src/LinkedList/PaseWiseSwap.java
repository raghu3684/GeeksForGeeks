package LinkedList;

/**
 * Created by ggorantla on 7/31/2014.
 * Source : http://www.geeksforgeeks.org/pairwise-swap-elements-of-a-given-linked-list-by-changing-links/
 */
public class PaseWiseSwap {
    public void pairWiseSwap(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;

        while (cur.next != null && cur.next.next != null){
            ListNode temp = cur.next;
            cur.next = cur.next.next;
            cur = cur.next;
            temp.next = cur.next;
            cur.next = temp;
            cur = cur.next;
        }

    }
}
