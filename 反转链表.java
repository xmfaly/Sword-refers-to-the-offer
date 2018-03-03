public class 反转链表 {

    public ListNode ReverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode tem = null;
        while (cur != null){
            tem = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tem;
        }
        return  pre;

    }
}
