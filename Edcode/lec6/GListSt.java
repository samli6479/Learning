public class GListSt{
	public static void main(String[] args){
		GList<Integer> s1 = new GList<Integer>(5);
		s1.insertFront(10);

		System.out.println(s1.getFront());

		GList<String> s2 = new GList<String>("ape");
		s2.insertFront("apple");
		System.out.println(s2.getFront());
	}
}