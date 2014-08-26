package LinkedList;

/**
 * Created by ggorantla on 8/1/2014.
 */
public class MergeLinkedListInAlternatePositions {
    public class NodePair{
        ListNode first;
        //Default
        ListNode second;
        NodePair(){

        }
        NodePair(ListNode a, ListNode b){
            this.first = a;
            this.second = b;
        }
    }

    public NodePair mergeLinkedListInAltPositions(ListNode a, ListNode b){
        NodePair res = new NodePair();
        ListNode cur_a = a, cur_b = b;
        ListNode a_next = null;
        ListNode b_next = null ;
        int cout = 0 ;
        while (cur_a != null && cur_b != null) {
            a_next = cur_a.next;
            b_next = cur_b.next;


            cur_b.next = a_next;
            cur_a.next = cur_b;

            cur_a = a_next;
            cur_b = b_next;

        }

        b = cur_b.next;
        res.first = a;
        res.second = b;
        return res;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = a.next = new ListNode(2);
        ListNode c = b.next = new ListNode(3);
        ListNode d = c.next = new ListNode(4);
        ListNode e = d.next = new ListNode(5);
        NodePrinter temp = new NodePrinter();
        //temp.print(a);
        ListNode d1= new ListNode(10);
        ListNode e1 = d.next = new ListNode(20);
        ListNode f = e.next = new ListNode(30);
        //ListNode g = f.next = new ListNode(40);
        //ListNode h = g.next = new ListNode(50);
        //temp.print(d);

        NodePair res = new MergeLinkedListInAlternatePositions().mergeLinkedListInAltPositions(a, d1);
        temp.print(res.first);
        temp.print(res.second);

    }
}
