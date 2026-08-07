
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode d=new ListNode(0); //d=dummy
        ListNode temp=d;

        while( carry!=0 || l1!=null || l2!=null ){
            int sum=carry;

            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            temp.next=new ListNode(sum%10);
            carry=sum/10;
            temp=temp.next;

        }
        return d.next;
    }
}