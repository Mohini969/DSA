class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans={-1,-1};
        int first=-1;
        int last=-1;
        int ind=1;
        int minDis=Integer.MAX_VALUE;

        ListNode prev=head;
        ListNode curr=head.next;

        while(curr.next!=null){
            if((curr.val>prev.val && curr.val>curr.next.val ||
                curr.val<prev.val && curr.val<curr.next.val)){
                if(first==-1) first=ind;
                else minDis=Math.min(minDis,ind-last);
                last=ind;
            }
            prev=curr;curr=curr.next;ind++;
        }
        if(first==-1 || first==last){
            return ans;
        }
        ans[0]=minDis;
        ans[1]=last-first;
        return ans;
    }
}