package LinkedList;

/**
 * Created by ggorantla on 8/24/2014.
 */
public class CopyOfRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head){
        RandomListNode cur = head;
        while (cur != null){
            RandomListNode NextNode = cur.next;
            cur.next = new RandomListNode(cur.label);
            cur.next.next = NextNode;
            cur = cur.next.next;
        }
        cur = head;
        while (cur != null){
            if(cur.random != null)
                cur.next.random = cur.random.next;
            cur = cur.next.next;
        }
        cur = head;
        RandomListNode copyCur = cur.next;
        RandomListNode copyHead = cur.next;
        while (cur.next.next != null){
            cur.next = cur.next.next;
            cur = cur.next;
            copyCur.next = copyCur.next.next;
            copyCur = copyCur.next;
        }
        cur.next = null;

        return copyHead;
    }
}
