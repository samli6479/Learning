import java.util.List;

public class MapHelp{
	public static <K, V> V get(ArrayMap<K,V> am, K k){
		if (am.containsKey(k)){
			return am.get(k);
		}
		return null;
	}

	public static <K extends Comparable<K> ,V>  K maxKey(ArrayMap<K,V> am){
		List<K> keys = am.keys();
		K maxKey = keys.get(0);
		for (int i = 0; i < keys.length; i += 1){
			int cmp;
			cmp = key.get(i).compareTo(maxKey);
			if (cmp > 0){
				maxKey = keys.get(i);
			}
		}
	}

	public static void main(String[] args){
		ArrayMap<Integer, String> ismap = new ArrayMap<Integer, String>();
		ismap.put(5, "hello");
		ismap.put(10,"Ketch");

		System.out.println(MapHelp.get(ismap ,5));
		System.out.println(MapHelp.get(ismap, 1));
	}
}