package com.codewithmosh.leetcode.merge;

public class Solution {

    static void main() {
//        list2 = [1,2,4],
//        list2 = [1,3,4]
        ListNode list1 = new ListNode(4);
        list1 = new ListNode(2, list1);
        list1 = new ListNode(1, list1);

        ListNode list2 = new ListNode(4);
        list2 = new ListNode(3, list2);
        list2 = new ListNode(1, list2);

        var result = mergeTwoLists(list1, list2);

        var cp = result;

        while (cp != null) {
            System.out.println(cp.val);
            cp = cp.next;
        }


    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null;

        while (true) {
            if (list1 == null && list2 == null) {
                break;
            }

            else if (list1 == null) {
                result = new ListNode(list2.val, result);
                list2 = list2.next;
            }

            else if (list2 == null) {
                result = new ListNode(list1.val, result);
                list1 = list1.next;
            }

            else if (list2.val <= list1.val) {
                result = new ListNode(list2.val, result);
                list2 = list2.next;
            } else {
                result = new ListNode(list1.val, result);
                list1 = list1.next;
            }
        }


        ListNode mergeList = null;
        while (result != null) {
            mergeList = new ListNode(result.val, mergeList);
            result = result.next;
        }

        return mergeList;
    }

}
