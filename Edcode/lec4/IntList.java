/** Defines a recursive list of integers. */

public class IntList{
	public int head;
	public IntList tail;

	public IntList(int h, IntList t){
		head = h;
		tail = t;
	}

	/** Return the saize of the IntList
    Recursive version
	*/

	public int size(){
		if (this.tail == null)
			return 1;
		int HeadSize = this.tail.size();
		return HeadSize + 1;
	}

	/** Iterative method */
	public int iterativeSize(){
		IntList p = this;
		int size = 0;
		while (p != null){
			size = size + 1;
			p = p.tail;
		}
		return size;
	}

	public int Edget(int i){
		IntList post = this;
		int pos = 0;
		int res = post.head;
		while (pos<i){
			post = post.tail;
		    res = post.head;
		    pos = pos + 1;
		}
		return res;
	}

	/**  Recursize */
	public int get(int i){
		if (i ==0){
			return this.head;
		}
		return this.tail.get(i-1);
	}

	/** To String */
	public String toString(){
		if (tail == null)
			return Integer.toString(head);
		return Integer.toString(head) + " " + tail.toString();
	}

	public static void main(String[] args){
		IntList L = new IntList(10,null);
		L.tail = new IntList(15,null);
		System.out.println(L.head);
		System.out.println(L.tail.head);
		System.out.println(L.size());
		System.out.println(L.iterativeSize());
		System.out.println(L.Edget(1));
		System.out.println(L.get(1));
	}
}