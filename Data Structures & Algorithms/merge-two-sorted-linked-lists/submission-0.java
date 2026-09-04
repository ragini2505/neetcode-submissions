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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        while (list1 != null) {
            arr1.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            arr2.add(list2.val);
            list2 = list2.next;
        }

        int i = 0, j = 0;
        List<Integer> merged = new ArrayList<>();

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                merged.add(arr1.get(i));
                i++;
            } else {
                merged.add(arr2.get(j));
                j++;
            }
        }

        while (i < arr1.size()) {
            merged.add(arr1.get(i));
            i++;
        }

        while (j < arr2.size()) {
            merged.add(arr2.get(j));
            j++;
        }

        ListNode head = null, tail = null;
        for (int val : merged) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }
}
