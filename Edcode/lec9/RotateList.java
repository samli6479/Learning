public class RotateList<Args> extends GList<Args>{

	public void rotateRight(){
		Args oldBack = delBack();
		insertFront(oldBack);
	}

	public static void main(String[] args){
		RotateList<Integer> rs1 = new RotateList<Integer>();
		rs1.insertBack(10);
		rs1.insertBack(15);
		rs1.insertFront(95);
		rs1.print();
		rs1.rotateRight();
		rs1.print();
	}
}