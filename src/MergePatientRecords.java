public class MergePatientRecords {

    public static ListNode mergeLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0, "", 0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {

            if (l1.ssn <= l2.ssn) {

                tail.next = l1;
                l1 = l1.next;

            } else {

                tail.next = l2;
                l2 = l2.next;
            }

            tail = tail.next;
        }

        if (l1 != null) {
            tail.next = l1;
        }

        if (l2 != null) {
            tail.next = l2;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.ssn + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }
}