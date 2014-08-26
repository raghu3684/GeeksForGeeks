package LinkedList;

/**
 * Created by ggorantla on 8/1/2014.
 */
public class NodePrinter {
    public void print(ListNode head){
        ListNode cur = head;
        while(cur != null){
            System.out.print(" " + cur.val);
            cur = cur.next;
        }
        System.out.println();
    }
}
