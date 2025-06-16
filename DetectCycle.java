package abc;

	class ListNodeCycle {
	    int val;
	    ListNodeCycle next;
	    ListNodeCycle(int val) { this.val = val; }
	}

	public class DetectCycle {
	    public static boolean hasCycle(ListNodeCycle head) {
	        ListNodeCycle slow = head;
	        ListNodeCycle fast = head;

	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;

	            if (slow == fast) return true;
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	        ListNodeCycle node1 = new ListNodeCycle(3);
	        ListNodeCycle node2 = new ListNodeCycle(2);
	        ListNodeCycle node3 = new ListNodeCycle(0);
	        ListNodeCycle node4 = new ListNodeCycle(-4);

	        node1.next = node2;
	        node2.next = node3;
	        node3.next = node4;
	        node4.next = node2;  // Cycle here

	        System.out.println("Has Cycle: " + hasCycle(node1));
	    }
	}
