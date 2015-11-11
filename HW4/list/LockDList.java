package list;

public class LockDList extends DList{
//	protected DListNode newNode(Object item, DListNode prev, DListNode next) {
//		return new LockDListNode(item, prev, next);
//	}
//	
	protected DListNode newNode(Object item, DListNode prev, DListNode next) {
		return new LockDListNode(item, prev, next);
	}
	
	public void lockNode(DListNode node)
	{
		if(node instanceof LockDListNode){
			LockDListNode n = (LockDListNode)node;
			n.setLocked(true);
		}
	}

	public void remove(DListNode node) 
	{
		if(((LockDListNode)node).isLocked == true)
		{
			return;
		}
		super.remove(node);
	}
//	public void insertNodefront(DListNode node){
//		node.prev = head;
//		node.next = head.next;
//		head.next.prev = node;
//		head.next = node;
//	}
//	public static void main(String[] args) {
//	    DList l = new DList();
//	    System.out.println("### TESTING insertFront(), front(), back() methods ###\nEmpty list is " + l);
//	    l.insertFront(9);
//	    System.out.println("Inserting 9 at front.\nList with 9 is " + l);
//	    if (!l.head.next.item.equals(9)) {
//	      System.out.println("head.next.item is wrong.");
//	    }
//	    if (!l.head.next.prev.equals(l.head)) {
//	      System.out.println("head.next.prev is wrong.");
//	    }
//	    if (!l.head.prev.item.equals(9)) {
//	      System.out.println("head.prev.item is wrong.");
//	    }
//	    if (!l.head.prev.next.equals(l.head)) {
//	      System.out.println("head.prev.next is wrong.");
//	    }
//	    if (l.size != 1) {
//	      System.out.println("size is wrong.");
//	    }
//	    System.out.println("the first item in DList is " + l.front().item);
//	    System.out.println("the last item in DList is " + l.back().item);
//	    l.insertFront(8);
//	    System.out.println("Inserting 8 at front.\nList with 8 and 9 is " + l);
//	    if (!l.head.next.item.equals(8)) {
//	      System.out.println("head.next.item is wrong.");
//	    }
//	    if (!l.head.next.prev.equals(l.head)) {
//	      System.out.println("head.next.prev is wrong.");
//	    }
//	    if (!l.head.prev.item.equals(9)) {
//	      System.out.println("head.prev.item is wrong.");
//	    }
//	    if (!l.head.prev.next.equals(l.head)) {
//	      System.out.println("head.prev.next is wrong.");
//	    }
//	    if (!l.head.next.next.equals(l.head.prev)) {
//	      System.out.println("l.head.next.next != l.head.prev.");
//	    }
//	    if (!l.head.prev.prev.equals(l.head.next)) {
//	      System.out.println("l.head.prev.prev != l.head.next.");
//	    }
//	    if (l.size != 2) {
//	      System.out.println("size is wrong.");
//	    }
//	    System.out.println("the first item in DList is " + l.front().item);
//	    System.out.println("the last item in DList is " + l.back().item);
//	    System.out.println("### TESTING insertBack ###\nList with 8 and 9 is " + l);
//	    l.insertBack(2);
//	    System.out.println("List with 2 in the back is " + l);
//	    if (!l.head.next.next.next.item.equals(2)) {
//	      System.out.println("head.next.next.item is wrong.oooo");
//	    }
//	    if (!l.head.prev.prev.equals(l.head.next.next)) {
//	      System.out.println("head.next.next.next.prev is wrong.");
//	    }
//	    if (!l.head.prev.item.equals(2)) {
//	      System.out.println("head.prev.item is wrong.");
//	    }
//	    if (!l.head.prev.next.equals(l.head)) {
//	      System.out.println("head.prev.next is wrong.");
//	    }
//	    if (l.size != 3) {
//	      System.out.println("size is wrong.");
//	    }
//	    System.out.println("the first item in DList is " + l.front().item);
//	    System.out.println("the last item in DList is " + l.back().item);
//	    System.out.println("###TESTING prev() and next() method##");
//	    System.out.println("the node previous to head is(shoulde be 2): " + l.prev(l.head).item);
//	    System.out.println("the node previous to head.next.next is(shoulde be 8): " + l.prev(l.head.next.next).item);
//	    System.out.println("the node previous to head.prev is(shoulde be 9): " + l.prev(l.head.prev).item);
//	    System.out.println("the node next to head is(shoulde be 8): " + l.next(l.head).item);
//	    System.out.println("the node next to head.next is(shoulde be 9): " + l.next(l.head.next).item);
//	    System.out.println("the node next to head.prev.prev is(shoulde be 2): " + l.next(l.head.prev.prev).item);
//	    System.out.println("###TESTING insertAfter() and insertBefore() method##");
//	    l.insertAfter(3, l.head);
//	    System.out.println("insert 3 after head " + l);
//	    l.insertAfter(6, l.head.prev);
//	    System.out.println("insert 6 after head.prev " + l);
//	    l.insertAfter(4, l.head.next);
//	    System.out.println("insert 4 after head.next " + l);
//	    l.insertBefore(11, l.head);
//	    System.out.println("insert 11 before head " + l);
//	    l.insertBefore(12, l.head.prev);
//	    System.out.println("insert 12 before head.prev " + l);
//	    l.insertBefore(13, l.head.next);
//	    System.out.println("insert 13 before head.next " + l);
//	    LockDList m = new LockDList();
//	    System.out.println("### TESTING remove() ###\nEmpty list is " + m);
//	    DListNode head = new DListNode(Integer.MIN_VALUE, null, null);
//	    head.next = head;
//	    head.prev = head;
//	    DListNode node1 = new LockDListNode(1, null, null);
//	    DListNode node11 = new DListNode(11, null, null);
//	    DListNode node2 = new LockDListNode(2, null, null);
//	    DListNode node3 = new LockDListNode(3, null, null);
//	    DListNode node12 = new DListNode(12, null, null);
//	    DListNode node13 = new DListNode(13, null, null);
//	    DListNode node4 = new LockDListNode(4, null, null);
//	    m.insertNodefront(node1);
//	    m.insertNodefront(node11);
//	    m.insertNodefront(node2);
//	    m.insertNodefront(node3);
//	    m.insertNodefront(node12);
//	    m.insertNodefront(node13);
//	    m.insertNodefront(node4);
//	    m.insertBack(3);
//	    System.out.println("##After inserting 7 nodes, LockDList is " + m);
//	    System.out.println("## node with item value 1,2,3,4 cannot be removed, 11,12,13 can be removed:");
//	    System.out.println("##test remove() method");
//	    m.remove(node1);
//	    System.out.println("after removing node1: " + m);
//	    m.remove(node11);
//	    System.out.println("after removing node11: " + m);
//	    m.remove(node2);
//	    System.out.println("after removing node2: " + m);
//	    m.remove(node3);
//	    System.out.println("after removing node3: " + m);
//	    m.remove(node12);
//	    System.out.println("after removing node12: " + m);
//	    m.remove(node13);
//	    System.out.println("after removing node13: " + m);
//	    m.remove(node4);
//	    System.out.println("after removing node4: " + m);
//  }
}
