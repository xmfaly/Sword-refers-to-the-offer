public class 合并两个排序的链表 {

    public ListNode Merge(ListNode list1,ListNode list2) {

        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        ListNode head;
        if(list1.val > list2.val){
            head = list2;
            list2 = list2.next;
        }else {
            head = list1;
            list1 = list1.next;
        }

        ListNode p = head;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                p.next = list1;
                list1 = list1.next;
            }else {
                p.next = list2;
                list2 = list2.next;

            }
            p = p.next;
        }

        if(p == null){
            return head;
        }
        if(list1 == null){
            p.next = list2;
        }else {
            p.next = list1;
        }
        return head;

    }
}
