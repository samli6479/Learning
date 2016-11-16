public class VengeGList<Args> extends GList<Args>{

	private GList<Args> dels; 

	public VengeGList(){
		dels = new GList<Args>();
	}

	/* Constructs a VengeGList with the given item inserted already */
	public VengeGList(Args x){
		super(x);
		dels = new GList<Args>();
	}

	@Override
	public Args delBack(){
		// Delete the last item --> Use superclass's method!
		// record the delete item
		Args del = super.delBack();
		dels.insertBack(del);
		return del;
	}

	public void printLostItem(){
		dels.print();
	}

	public static void main(String[] args){
		VengeGList<Integer> vs1 = new VengeGList<Integer>();
		vs1.insertBack(1);
		vs1.insertBack(5);
		vs1.insertBack(10);
		vs1.insertBack(15);

		vs1.delBack();
		vs1.delBack();
		System.out.print("The Fallen are: ");

		vs1.printLostItem();
	}
}