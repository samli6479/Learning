/** An SList is a list of integers that can be expanded arbiraily.
 *  All the real work is done by IntNodes. */

public class SList{

	public class IntNode{
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n){
		item = i;
		next = n;
		}
	}

	// private IntNode front;
	private IntNode sentinel;
	private int size;


	/* Create a new SList of size 1.*/


	// public SList(int x){
	// 	front = new IntNode(x, null);
	// 	size = 1;
	// }
	// public SList(){
	// 	front = null;
	// 	size = 0;
	// }
	public SList(){
		size = 0;
		sentinel = new IntNode(892374, null);
	}

	public SList(int x){
		size = 1;
		sentinel = new IntNode(-13214,null);
		sentinel.next = new IntNode(x, null);
	}

	// public void insertFront(int x){
	// 	IntNode oldFront = front;
	// 	front = new IntNode(x, oldFront);
	// 	size += 1;
	// }
	public void insertFront(int x){
		size += 1;
		IntNode oldActualFrontNode = sentinel.next;
		sentinel.next = new IntNode(x, oldActualFrontNode);
	}

	/** The back node of your list. */
	private IntNode getBackNode(){
		IntNode p = sentinel;
		while (p.next != null){
			p = p.next;
		}
		return p;
	}

	public void insertBack(int x){
		size += 1;
		IntNode oldBack = getBackNode();
		oldBack.next = new IntNode(x, null);
	}

	// public void insertBack(int x){
	// 	size += 1;


	// 	if (front == null){
	// 		front = new IntNode (x, null);
	// 		return;
	// 	}

	// 	IntNode p = front;

	// 	while (p.next != null){
	// 		p = p.next;
	// 	}

	// 	p.next = new IntNode(x, null);
	// }

	// public int getFront(){
	// 	return front.item;
	// }
	public int getFront(){
		return sentinel.next.item;
	}


	/** When working with naked recursive data structure gods,
	We usually create a private helper method that deals with them directly
	*/

	/** Nicer to use static since it is not using any other instances */

	/** Current way of working O(N) */
	// private static int IntNodeSize(IntNode n){
	// 	if (n.next == null){
	// 		return 1;			
	// 	}
	// 	return 1 + IntNodeSize(n.next);
	// }

	public int size(){
		return size;
	}

	public static void main(String[] args){
		SList s1 = new SList();
		s1.insertBack(15);
		s1.insertFront(5);
		s1.insertFront(0);
		System.out.println(s1.size());
	}
}