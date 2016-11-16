/** Define a list interface for all lists*/

public interface EdList<Args>{
	public void insertFront(Args x);
	public Args getFront();
	public void insertBack(Args x);
	public int size();
	public Args get(int position);

	default public void print() {
		for (int i =0; i <= size(); i += 1){
			System.out.print(get(i) + " ");
		}
		System.out.println();

	}
}