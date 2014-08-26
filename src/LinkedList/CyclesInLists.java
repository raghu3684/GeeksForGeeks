package LinkedList;

/**
 * Created by ggorantla on 8/24/2014.
 */
public class CyclesInLists {
    public boolean linkedListCycleI(ListNode head){
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return  true;
        }
        return false;
    }

    public ListNode linkedListCycleII(ListNode head){
        ListNode fast = head,slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) break;
        }
        if (fast == null || fast.next.next == null) return null;
        slow = head;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
}
