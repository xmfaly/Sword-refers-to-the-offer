public class 两个链表的第一个公共结点 {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1;
        ListNode p2 ;
        while(p1 != null){
            p2 = pHead2;
            while(p2 != null){

                if(p2 == p1){
                    return p2;
                }
                p2 = p2.next;
            }
            p1 = p1.next;
        }
        return null;
    }
}
