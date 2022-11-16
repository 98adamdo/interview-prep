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
import java.util.HashSet;
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> hs = new HashSet<>();
        ListNode fake = new ListNode(-1);
        fake.next = head;
        ListNode pointer = fake;
        while(pointer.next != null) {
            if(hs.contains(pointer.next.val)){
                pointer.next = pointer.next.next;
            }
            else {
                hs.add(pointer.next.val);
                pointer = pointer.next;
            }
        }
        return fake.next;
    }
}