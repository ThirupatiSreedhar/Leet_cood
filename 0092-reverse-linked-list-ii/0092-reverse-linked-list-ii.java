/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> a = new ArrayList<>();
     ListNode l =head;
     while(head!=null){
        a.add(head.val);
        head=head.next;
     }   
     int i=left-1;
     int j=right-1;
    
        while (i < j) {
            int temp = a.get(i);
            a.set(i, a.get(j));
            a.set(j, temp);
            i++;
            j--;
        }
      

     
     head = l;
    for(int k=0;k<a.size();k++){
        head.val=a.get(k);
        head= head.next;
    }
    head =l;
    return head;
    }
}