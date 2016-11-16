/** An GList is a list of Argsegers that can be expanded arbiraily.
 *  All the real work is done by Nodes. */

public class GList<Args> implements EdList<Args>{

	public class Node{
		public Args item;
		public Node next;

		public Node(Args i, Node n){
		item = i;
		next = n;
		}
	}

	// private Node front;
	private Node sentinel;
	private int size;


	/* Create a new GList of size 1.*/


	// public GList(Args x){
	// 	front = new Node(x, null);
	// 	size = 1;
	// }
	// public GList(){
	// 	front = null;
	// 	size = 0;
	// }
	public GList(){
		size = 0;
		sentinel = new Node(null, null);
	}

	public GList(Args x){
		size = 1;
		sentinel = new Node(null,null);
		sentinel.next = new Node(x, null);
	}

	// public void insertFront(Args x){
	// 	Node oldFront = front;
	// 	front = new Node(x, oldFront);
	// 	size += 1;
	// }
	@Override
	public void insertFront(Args x){
		size += 1;
		Node oldActualFrontNode = sentinel.next;
		sentinel.next = new Node(x, oldActualFrontNode);
	}

	/** The back node of your list. */
	private Node getBackNode(){
		Node p = sentinel;
		while (p.next != null){
			p = p.next;
		}
		return p;
	}

	@Override
	public void insertBack(Args x){
		size += 1;
		Node oldBack = getBackNode();
		oldBack.next = new Node(x, null);
	}

	// public void insertBack(Args x){
	// 	size += 1;


	// 	if (front == null){
	// 		front = new Node (x, null);
	// 		return;
	// 	}

	// 	Node p = front;

	// 	while (p.next != null){
	// 		p = p.next;
	// 	}

	// 	p.next = new Node(x, null);
	// }

	// public Args getFront(){
	// 	return front.item;
	// }

	public Args getBack(){
		Node rec = getBackNode();
		return rec.item;
	}

	public Args delBack(){
		Node old = getBackNode();
		if (old == sentinel){
			return null;
		}

		Node p = sentinel;

		size = size - 1;

		while (p.next != old){
			p = p.next;
		}
		p.next = null;
		return old.item;
	}

	@Override   
	public   Args getFront(){
		return sentinel.next.item;
	}

	@Override
	public Args get(int i){
		int j = 0;
		Node p = sentinel;

		while (j < i){
			p = p.next;
			j = j + 1;
		}
		return p.item;
	}



	/** When working with naked recursive data structure gods,
	We usually create a private helper method that deals with them directly
	*/

	/** Nicer to use static since it is not using any other instances */

	/** Current way of working O(N) */
	// private static Args NodeSize(Node n){
	// 	if (n.next == null){
	// 		return 1;			
	// 	}
	// 	return 1 + NodeSize(n.next);
	// }
	@Override
	public int size(){
		return size;
	}

	@Override
	public void print(){
		for (int i =1;i < size()+1;i+=1){
			System.out.print(get(i) + " ");
		}
		System.out.println();
	}

	public void Extra(){
		System.out.println("Party!");
	}

 	public static void main(String[] args){
		GList s1 = new GList();
		s1.insertBack("15");
		s1.insertBack("5");
		System.out.println(s1.getBack());
		s1.delBack();
		System.out.println(s1.size());
		System.out.println(s1.get(1));
		s1.print();
	}
}