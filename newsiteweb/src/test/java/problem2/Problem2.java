package problem2;

/**
 * Created by nawei on 2018/11/20.
 */
public class Problem2 {

    public static void main(String[] args) {
        int[] array1 = {9,1,6};
        int[] array2 = {0};
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(0);
        ListNode head1 = node1;
        ListNode head2 = node2;
        for(int i=0;i<array1.length;i++){
            ListNode tempNode1 = new ListNode(array1[i]);
            head1.next = tempNode1;
            head1 = head1.next;
        }

        for(int i=0;i<array2.length;i++){
            ListNode tempNode2 = new ListNode(array2[i]);
            head2.next = tempNode2;
            head2 = head2.next;
        }

        ListNode resultNode = addTwoNumbers(node1.next,node2.next);
        ListNode resultHead = resultNode;
        while (resultHead!=null){
            System.out.println(resultHead.val);
            resultHead = resultHead.next;
        }
    }

    /**
     * 加和两个节点
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;ListNode p2 = l2;
        ListNode dummyHead = new ListNode(0);
        ListNode curNode = dummyHead;
        int carryValue = 0;
        while(p1!=null || p2!=null){
            int x = p1!=null?p1.val:0;
            int y = p2!=null?p2.val:0;
            int sum = x + y + carryValue;
            ListNode tempNode = new ListNode(sum%10);
            curNode.next = tempNode;
            carryValue = sum/10;
            curNode = curNode.next;

            if ((p1==null||p1.next==null) && (p2==null||p2.next==null)){
                break;
            }
            if(p1!=null){
                p1 = p1.next;
            }
            if(p2!=null) {
                p2 = p2.next;
            }
        }

        if (carryValue>0){
            ListNode tempNode = new ListNode(carryValue);
            curNode.next = tempNode;
        }

        return dummyHead.next;

    }
}
