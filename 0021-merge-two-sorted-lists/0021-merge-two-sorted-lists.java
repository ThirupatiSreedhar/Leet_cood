class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ArrayList<Integer> a = new ArrayList<>();

        while (list1 != null) {
            a.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            a.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(a);

        ListNode head = null;
        ListNode temp = null;

        for (int i = 0; i < a.size(); i++) {

            ListNode newNode = new ListNode(a.get(i));

            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
        }

        return head;
    }
}