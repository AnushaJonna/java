package abc;

	class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int val) { this.val = val; }
	}

	public class ReverseLinkedList {
	    public static ListNode reverseList(ListNode head) {
	        ListNode prev = null;
	        while (head != null) {
	            ListNode nextTemp = head.next;
	            head.next = prev;
	            prev = head;
	            head = nextTemp;
	        }
	        return prev;
	    }

	    public static void printList(ListNode head) {
	        while (head != null) {
	            System.out.print(head.val + " ");
	            head = head.next;
	        }
	    }

	    public static void main(String[] args) {
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head = reverseList(head);
	        printList(head);
	    }
	}
