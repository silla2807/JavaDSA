class Solution {

  public ListNode reverse(ListNode head) {
    ListNode result = null; 
    // TODO: Write your code here
    ListNode current = head;
    ListNode prev = null ;
    ListNode next;

    while(current!=null)
    {
      next= current.next;
      current.next= prev;
      prev = current;
      current = next;
    }
     result= prev;
   
   return result;
  }
}
