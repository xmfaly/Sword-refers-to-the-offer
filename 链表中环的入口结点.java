import java.util.ArrayList;

public class 链表中环的入口结点 {

    public ListNode EntryNodeOfLoop(ListNode pHead) {

        ListNode p = pHead;

        if(p == null)
            return null;
        ArrayList<ListNode> a = new ArrayList<>();
        a.add(p);
        while(p.next != null){
            p = p.next;
            if(a.contains(p)){
                return p;
            }else {
                a.add(p);
            }
        }
        return null;

    }
}
