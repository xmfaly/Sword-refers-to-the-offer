public class 链表中倒数第k个结点 {

    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode pre = head;
        if(pre == null || k <=0){
            return null;
        }
        for(int i = 0;i<k;i++){
            if(pre != null){
                pre = pre.next;
            }else {
                return null;
            }

        }

        ListNode cur = head;
        while(pre!= null){
            pre = pre.next;
            cur = cur.next;
        }
        return cur;
    }
}
