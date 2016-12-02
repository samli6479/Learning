import java.util.Iterator;

public class ArrayMapClient {
	public static void main(String[] args){
		ArrayMap<String, Integer> am = new ArrayMap <String, Integer>();
		am.put("hello", 5);
		am.put("EM", 10);

		ArrayMap.MapIt ami =  am.new MapIt();

		while (ami.hasNext()){
			System.out.println(ami.next());
		}

		am.put("Money", 8000);
		for (String s: am){
			System.out.println(s);
		}
	}
}