public class Main {

    public static void main(String[] args) {

        System.out.println("===== HEALTH MERGE DEMO =====\n");

        ListNode a1 = new ListNode(1001, "John", 30);
        ListNode a2 = new ListNode(1005, "Alice", 25);
        a1.next = a2;

        ListNode b1 = new ListNode(1002, "Bob", 40);
        ListNode b2 = new ListNode(1006, "Emma", 35);
        b1.next = b2;

        ListNode result = MergePatientRecords.mergeLists(a1, b1);
        
        MergePatientRecords.printList(result);
    }
}